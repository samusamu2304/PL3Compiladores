package org.uah;

import linguine.LinguineParser;
import linguine.LinguineParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class LingVisitor extends LinguineParserBaseVisitor<String> {
    TablaSimbolos tablaSimbolos;
    LinguineParser parser;
    public LingVisitor(TablaSimbolos tablaSimbolos, LinguineParser parser) {
        this.tablaSimbolos = tablaSimbolos;
        this.parser = parser;
    }
    @Override
    public String visitAsigSimple(LinguineParser.AsigSimpleContext ctx) {
        String codJasmin = "";
        if (tablaSimbolos.existeVariable(ctx.ID().getText())) {
            Object[] valor = tablaSimbolos.getVariable(ctx.ID().getText()).getValor();
            String tipo = tablaSimbolos.getVariable(ctx.ID().getText()).getTipo();
            String resultado = visit(ctx.expresion());
            codJasmin += resultado;
            switch (tipo) {
                case "INT":
                    codJasmin += "istore_" + valor[1] + "\n";
                    break;
                case "STRING":
                    codJasmin += "astore_" + valor[1] + "\n";
                    break;
                case "FLOAT":
                    codJasmin += "fstore_" + valor[1] + "\n";
                    break;
                case "BOOL":
                    codJasmin += "istore_" + valor[1] + "\n";
                    break;
                case "ID":
                    codJasmin += "istore_" + valor[1] + "\n";
                    break;
                case "CODIGO":
                    //no se hace nada por ahora
                    break;
            }
            tablaSimbolos.updateVariable(ctx.ID().getText(), new Object[]{resultado, valor[1]});//actualiza el valor del codigo
        } else {
            System.out.println("Error: la variable " + ctx.ID().getText() + " no fue declarada.");
        }
        return codJasmin;
    }

    @Override
    public String visitProgram(LinguineParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitSentencia(LinguineParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitDeclaracion(LinguineParser.DeclaracionContext ctx) {
        /**
         * Valores de las variables separados en dos partes:
         * valor[0] = codigo de la variable
         * valor[1] = indice de variable local
         * **/
        Object[] valor = {null,null};
        String tipo = "desconocido";
        String codJasmin = "";
        String regla = parser.getRuleNames()[(((ParserRuleContext) ctx.getChild(3)).getRuleIndex())];
        switch (regla) {
            case "expresion":
                if (ctx.getChild(3).getChildCount() == 1) {
                    TerminalNode terminalNode = (TerminalNode) ctx.getChild(3).getChild(0);
                    int tipoToken = terminalNode.getSymbol().getType();
                    tipo = parser.VOCABULARY.getSymbolicName(tipoToken);
                    codJasmin += visit(ctx.getChild(3));
                    valor[0] = codJasmin;
                    valor[1] = getContadorEtiqueta();
                    switch (tipo) {
                        case "INT":
                            codJasmin += "istore_" + valor[1] + "\n";
                            break;
                        case "STRING":
                            codJasmin += "astore_" + valor[1] + "\n";
                            break;
                        case "FLOAT":
                            codJasmin += "fstore_" + valor[1] + "\n";
                            break;
                        case "BOOL":
                            codJasmin += "istore_" + valor[1] + "\n";
                            break;
                        case "ID":
                            codJasmin += "istore_" + valor[1] + "\n";
                            break;
                    }
                } else {
                    valor[0] = visit(ctx.getChild(3));
                    tipo = "CODIGO";
                }
                break;
            case "condicional":
                valor[0] = visit(ctx.getChild(3));
                tipo = "CODIGO";
                break;
            case "match":
                valor[0] = visit(ctx.getChild(3));
                tipo = "CODIGO";
                break;
        }
        tablaSimbolos.addVariable(ctx.ID().getText(), tipo, valor);
        return codJasmin;
    }

    @Override
    public String visitInc(LinguineParser.IncContext ctx) {
        return super.visitInc(ctx);
    }

    @Override
    public String visitDec(LinguineParser.DecContext ctx) {
        return super.visitDec(ctx);
    }

    @Override
    public String visitFor(LinguineParser.ForContext ctx) {
        return super.visitFor(ctx);
    }

    @Override
    public String visitWhile(LinguineParser.WhileContext ctx) {
        return super.visitWhile(ctx);
    }

    @Override
    public String visitCondicional(LinguineParser.CondicionalContext ctx) {
        String codJasmin = "";
        codJasmin += visit(ctx.getChild(2));
        codJasmin += "ldc 1\n";
        String etiqueta1 = "L" + getContadorEtiqueta();
        String codRamaThen = visit(ctx.getChild(5));  // Genera código para la rama THEN
        String etiqueta2 = "L" + getContadorEtiqueta();
        String codRamaElse = "";
        if (ctx.getChildCount() > 7) {
            codRamaElse = visit(ctx.getChild(7));  // Genera código para la rama ELSE
        }
        codJasmin += "ifeq " + etiqueta1 + "\n";
        codJasmin += codRamaThen;
        codJasmin += "goto " + etiqueta2 + "\n";
        codJasmin += etiqueta1 + ":\n";
        codJasmin += codRamaElse;
        codJasmin += etiqueta2 + ":\n";
        return codJasmin;
    }

    @Override
    public String visitFuncion(LinguineParser.FuncionContext ctx) {
        //TODO: Completar esta cagada
        String codJasmin = "";
        codJasmin += ".method public static "+ctx.ID().getText()+"(";
        codJasmin += toRomans(ctx.params().getChildCount()) + ")I\n";
        codJasmin += ".limit stack 100\n";
        codJasmin += ".limit locals 100\n";
        FuncVisitor funcVisitor = new FuncVisitor(tablaSimbolos, parser);
        codJasmin += funcVisitor.visit(ctx.sentencia());
        codJasmin += "ireturn\n";
        codJasmin += ".end method\n";
        return codJasmin;
    }

    @Override
    public String visitParams(LinguineParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public String visitShow(LinguineParser.ShowContext ctx) {
        String codJasmin = "";
        String tipo = "desconocido";
        if (ctx.expresion().getChildCount() == 1) {
            TerminalNode terminalNode = (TerminalNode) ctx.expresion().getChild(0);
            int tipoToken = terminalNode.getSymbol().getType();
            tipo = parser.VOCABULARY.getSymbolicName(tipoToken);
            if (tipo.equals("ID")) {
                if (tablaSimbolos.existeVariable(ctx.expresion().getText())) {
                    tipo = tablaSimbolos.getVariable(ctx.expresion().getText()).getTipo();
                } else {
                    System.out.println("Error: la variable " + ctx.expresion().getText() + " no fue declarada.");
                }
            }
            switch (tipo) {
                case "INT":
                    codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
                    codJasmin += visit(ctx.expresion());
                    codJasmin += "invokevirtual java/io/PrintStream/println(I)V\n";
                    break;
                case "STRING":
                    codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
                    codJasmin += visit(ctx.expresion());
                    codJasmin += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
                    break;
                case "FLOAT":
                    codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
                    codJasmin += visit(ctx.expresion());
                    codJasmin += "invokevirtual java/io/PrintStream/println(F)V\n";
                    break;
                case "BOOL":
                    codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
                    codJasmin += visit(ctx.expresion());
                    codJasmin += "invokevirtual java/io/PrintStream/println(I)V\n";
                    break;
            }
        } else {
            /** Se asume que si hay varias cosas, es un int (gestionar mas tarde si da tiempo) **/
            codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
            codJasmin += visit(ctx.expresion());
            codJasmin += "invokevirtual java/io/PrintStream/println(I)V\n";
        }

        return codJasmin;
    }

    @Override
    public String visitMatch(LinguineParser.MatchContext ctx) {
        return super.visitMatch(ctx);
    }

    @Override
    public String visitCases(LinguineParser.CasesContext ctx) {
        return super.visitCases(ctx);
    }

    @Override
    public String visitCase(LinguineParser.CaseContext ctx) {
        return super.visitCase(ctx);
    }

    @Override
    public String visitFloat(LinguineParser.FloatContext ctx) {
        String codJasmin = "";
        codJasmin += "ldc "+ctx.getText()+"\n";
        return codJasmin;
    }

    @Override
    public String visitBool(LinguineParser.BoolContext ctx) {
        String codJasmin = "";
        if (ctx.getText().equals("true")){
            codJasmin += "ldc 1\n";
        }else{
            codJasmin += "ldc 0\n";
        }
        return codJasmin;
    }

    @Override
    public String visitLlamadaFuncion(LinguineParser.LlamadaFuncionContext ctx) {
        String codJasmin = "";
        codJasmin += "invokestatic "+ ctx.ID().getText()+"(";
        codJasmin += toRomans(ctx.args().getChildCount()) + ")I\n";
        return codJasmin;
    }

    @Override
    public String visitMulDiv(LinguineParser.MulDivContext ctx) {
        String codJasmin = "";
        codJasmin += visit(ctx.getChild(0));
        codJasmin += visit(ctx.getChild(2));
        if (ctx.getChild(1).getText().equals("*")){
            codJasmin += "imul\n";
        }else{
            codJasmin += "idiv\n";
        }
        return codJasmin;
    }

    @Override
    public String visitAddSub(LinguineParser.AddSubContext ctx) {
        String codJasmin = "";
        codJasmin += visit(ctx.getChild(0));
        codJasmin += visit(ctx.getChild(2));
        if (ctx.getChild(1).getText().equals("+")){
            codJasmin += "iadd\n";
        }else{
            codJasmin += "isub\n";
        }
        return codJasmin;
    }

    @Override
    public String visitParentesis(LinguineParser.ParentesisContext ctx) {
        String codJasmin = "";
        codJasmin += visit(ctx.getChild(1));
        return codJasmin;
    }

    @Override
    public String visitRel(LinguineParser.RelContext ctx) {
        String codJasmin = "";
        codJasmin += visit(ctx.getChild(0));
        codJasmin += visit(ctx.getChild(2));
        switch (ctx.getChild(1).getText()){
            case "<":
                codJasmin += "if_icmplt ";
                break;
            case ">":
                codJasmin += "if_icmpgt ";
                break;
            case "<=":
                codJasmin += "if_icmple ";
                break;
            case ">=":
                codJasmin += "if_icmpge ";
                break;
            case "==":
                codJasmin += "if_icmpeq ";
                break;
            case "!=":
                codJasmin += "if_icmpne ";
                break;
        }
        String etiqueta1 = "L"+getContadorEtiqueta();
        codJasmin += etiqueta1+"\n";
        codJasmin += "ldc 0\n";
        String etiqueta2 = "L"+getContadorEtiqueta();
        codJasmin += "goto "+etiqueta2+"\n";
        codJasmin += etiqueta1 +":\n";
        codJasmin += "ldc 1\n";
        codJasmin += etiqueta2+":\n";
        return codJasmin;
    }

    @Override
    public String visitId(LinguineParser.IdContext ctx) {
        String codJasmin = "";
        if (!(ctx.getParent() instanceof LinguineParser.DeclaracionContext) && !(ctx.getParent() instanceof LinguineParser.AsignacionContext)) {
            if (tablaSimbolos.existeVariable(ctx.getText())) {
                Object[] valor = tablaSimbolos.getVariable(ctx.getText()).getValor();

                switch (tablaSimbolos.getVariable(ctx.getText()).getTipo()){
                    case "INT":
                        codJasmin += "iload_"+valor[1]+"\n";
                        break;
                    case "STRING":
                        codJasmin += "aload_"+valor[1]+"\n";
                        break;
                    case "FLOAT":
                        codJasmin += "fload_"+ valor[1]+"\n";
                        break;
                    case "BOOL":
                        codJasmin += "iload_"+ valor[1]+"\n";
                        break;
                    case "ID":
                        codJasmin += "iload_"+ valor[1]+"\n";
                        break;
                    case "CODIGO":
                        codJasmin += valor[0];
                        break;

                }
            } else {
                System.out.println("Error: la variable " + ctx.getText() + " no fue declarada.");
            }
        }
        return codJasmin;
    }

    @Override
    public String visitString(LinguineParser.StringContext ctx) {
        String codJasmin = "";
        codJasmin += "ldc "+ctx.getText()+"\n";
        return codJasmin;
    }

    @Override
    public String visitAndOr(LinguineParser.AndOrContext ctx) {
        return super.visitAndOr(ctx);
    }

    @Override
    public String visitInt(LinguineParser.IntContext ctx) {
        return "ldc "+ctx.getText()+"\n";
    }

    @Override
    public String visitAsigCond(LinguineParser.AsigCondContext ctx) {
        return super.visitAsigCond(ctx);
    }

    @Override
    public String visitAsigMatch(LinguineParser.AsigMatchContext ctx) {
        return super.visitAsigMatch(ctx);
    }

    @Override
    public String visitArgs(LinguineParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    private String toRomans(int number) {
        String roman = "";
        int repeat;
        int[] decimal = {1000, 500, 100, 50, 10, 5, 1};
        String[] romanSymbols = {"M", "D", "C", "L", "X", "V", "I"};
        for (int i = 0; i < decimal.length; i++) {
            repeat = number / decimal[i];
            for (int j = 1; j <= repeat; j++) {
                roman += romanSymbols[i];
            }
            number %= decimal[i];
        }
        return roman;
    }

    private int contadorEtiqueta = 1;//0 reservado
    private int getContadorEtiqueta(){
        //Genera etiquetas unicas para cada condicional
        return contadorEtiqueta++;
    }


    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }
}
