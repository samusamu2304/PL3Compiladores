package org.uah;

import linguine.LinguineParser;
import linguine.LinguineParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
        if (tablaSimbolos.existeSimbolo(ctx.ID().getText())) {
            int iVar = tablaSimbolos.getSimbolo(ctx.ID().getText()).getiVar();
            String tipo = tablaSimbolos.getSimbolo(ctx.ID().getText()).getTipo();
            String resultado = visit(ctx.expresion());
            codJasmin += resultado;
            switch (tipo) {
                case "INT":
                    codJasmin += "istore " + iVar + "\n";
                    break;
                case "STRING":
                    codJasmin += "astore " + iVar + "\n";
                    break;
                case "FLOAT":
                    codJasmin += "fstore " + iVar + "\n";
                    break;
                case "BOOLEAN":
                    codJasmin += "istore " + iVar + "\n";
                    break;
                case "ID":
                    codJasmin += "istore " + iVar + "\n";
                    break;
                case "CODIGO":
                    //no se hace nada por ahora
                    break;
            }
            tablaSimbolos.updateVariable(ctx.ID().getText(),tipo,iVar,resultado,resultado);//actualiza el valor del codigo
        } else {
            System.out.println("Error: la variable " + ctx.ID().getText() + " no fue declarada.");
        }
        return codJasmin;
    }

    @Override
    public String visitAsigCond(LinguineParser.AsigCondContext ctx) {
        //solo permite asignar enteros
        String codJasmin = "";
        if (tablaSimbolos.existeSimbolo(ctx.ID().getText())) {
            int iVar = tablaSimbolos.getSimbolo(ctx.ID().getText()).getiVar();
            String tipo = tablaSimbolos.getSimbolo(ctx.ID().getText()).getTipo();
            String valor = "desconocido";
            String codigo = "condicional";
            codJasmin += visit(ctx.condicional());
            codJasmin += "istore " + iVar + "\n";
            tablaSimbolos.updateVariable(ctx.ID().getText(),tipo,iVar,valor,codigo);
        } else {
            System.out.println("Error: la variable " + ctx.ID().getText() + " no fue declarada.");
        }
        return codJasmin;
    }

    @Override
    public String visitAsigMatch(LinguineParser.AsigMatchContext ctx) {
        //solo permite asignar enteros
        String codJasmin = "";
        if (tablaSimbolos.existeSimbolo(ctx.ID().getText())) {
            int iVar = tablaSimbolos.getSimbolo(ctx.ID().getText()).getiVar();
            String tipo = tablaSimbolos.getSimbolo(ctx.ID().getText()).getTipo();
            String valor = "desconocido";
            String codigo = "match";
            codJasmin += visit(ctx.match());
            codJasmin += "istore " + iVar + "\n";
            tablaSimbolos.updateVariable(ctx.ID().getText(),tipo,iVar,valor,codigo);
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
        Object valor = null;
        int iVar = 0;
        String tipo = "desconocido";
        String codJasmin = "";
        String codigo = "desconocido";
        String regla = parser.getRuleNames()[(((ParserRuleContext) ctx.getChild(3)).getRuleIndex())];
        System.out.println(regla);
        switch (regla) {
            case "expresion":
                if (ctx.getChild(3).getChildCount() == 1) {
                    TerminalNode terminalNode = (TerminalNode) ctx.getChild(3).getChild(0);
                    int tipoToken = terminalNode.getSymbol().getType();
                    tipo = parser.VOCABULARY.getSymbolicName(tipoToken);
                    codJasmin += visit(ctx.getChild(3));
                    codigo = codJasmin;
                    valor = terminalNode.getText();
                    iVar = getContadorEtiqueta();
                    switch (tipo) {
                        case "INT":
                            codJasmin += "istore " + iVar + "\n";
                            break;
                        case "STRING":
                            codJasmin += "astore " + iVar + "\n";
                            break;
                        case "FLOAT":
                            codJasmin += "fstore " + iVar + "\n";
                            break;
                        case "BOOLEAN":
                            codJasmin += "istore " + iVar + "\n";
                            break;
                        case "ID":
                            codJasmin += "istore " + iVar + "\n";
                            break;
                    }
                } else {
                    valor = "desconocido";
                    tipo = "CODIGO";
                }
                break;
            case "condicional":
            case "match":
                codJasmin += visit(ctx.getChild(3));
                valor = "desconocido";
                codigo = "condicional/match";
                iVar = getContadorEtiqueta();
                codJasmin+= "istore "+iVar+"\n";
                tipo = "INT";//solo asignamos int porque no tenemos manera factible de saber el tipo
                break;
        }
        tablaSimbolos.addVariable(ctx.ID().getText(), tipo, iVar, "variable", valor, codigo);
        return codJasmin;
    }

    @Override
    public String visitInc(LinguineParser.IncContext ctx) {
        String codJasmin = "";
if (tablaSimbolos.existeSimbolo(ctx.ID().getText())) {
    //TODO: Impedir que se pueda incrementar un string
            int iVar = tablaSimbolos.getSimbolo(ctx.ID().getText()).getiVar();
            String tipo = tablaSimbolos.getSimbolo(ctx.ID().getText()).getTipo();
            switch (tipo) {
                case "INT":
                    codJasmin += "iload " + iVar+ "\n";
                    codJasmin += "ldc 1\n";
                    codJasmin += "iadd\n";
                    codJasmin += "istore " +iVar + "\n";
                    break;
                case "FLOAT":
                    codJasmin += "fload " + iVar+ "\n";
                    codJasmin += "ldc 1\n";
                    codJasmin += "fadd\n";
                    codJasmin += "fstore " +iVar + "\n";
                    break;
                case "ID":
                    codJasmin += "iload " + iVar+ "\n";
                    codJasmin += "ldc 1\n";
                    codJasmin += "iadd\n";
                    codJasmin += "istore " +iVar + "\n";
                    break;
            }
        } else {
            System.out.println("Error: la variable " + ctx.ID().getText() + " no fue declarada.");
        }
        return codJasmin;
    }

    @Override
    public String visitDec(LinguineParser.DecContext ctx) {
        //TODO: Impedir que se pueda decrementar un string
        String codJasmin = "";
        if (tablaSimbolos.existeSimbolo(ctx.ID().getText())) {
            int iVar = tablaSimbolos.getSimbolo(ctx.ID().getText()).getiVar();
            String tipo = tablaSimbolos.getSimbolo(ctx.ID().getText()).getTipo();
            switch (tipo) {
                case "INT":
                    codJasmin += "iload " + iVar+ "\n";
                    codJasmin += "ldc 1\n";
                    codJasmin += "isub\n";
                    codJasmin += "istore " +iVar + "\n";
                    break;
                case "FLOAT":
                    codJasmin += "fload " + iVar+ "\n";
                    codJasmin += "ldc 1\n";
                    codJasmin += "fsub\n";
                    codJasmin += "fstore " +iVar + "\n";
                    break;
                case "ID":
                    codJasmin += "iload " + iVar+ "\n";
                    codJasmin += "ldc 1\n";
                    codJasmin += "isub\n";
                    codJasmin += "istore " +iVar + "\n";
                    break;
            }
        } else {
            System.out.println("Error: la variable " + ctx.ID().getText() + " no fue declarada.");
        }
        return codJasmin;
    }

    @Override
    public String visitFor(LinguineParser.ForContext ctx) {
        tablaSimbolos.pushTabla();
        String repLabel = "L" + getContadorEtiqueta();
        String endLabel = "L" + getContadorEtiqueta();
        String codJasmin = "";
        codJasmin += visit(ctx.declaracion());
        codJasmin += repLabel + ":\n";
        codJasmin += visit(ctx.expresion());
        codJasmin += "ldc 1\n";
        codJasmin += "if_icmpne " + endLabel + "\n";
        if (ctx.sentencia() != null){
            for (LinguineParser.SentenciaContext sentenciaContext : ctx.sentencia()) {
                codJasmin += visit(sentenciaContext);
            }
        }
        codJasmin += visit(ctx.asignacion());
        codJasmin += "goto " + repLabel + "\n";
        codJasmin += endLabel + ":\n";
        tablaSimbolos.popTabla();
        return codJasmin;
    }

    @Override
    public String visitWhile(LinguineParser.WhileContext ctx) {
        tablaSimbolos.pushTabla();
        String codJasmin = "";
        String repLabel = "L" + getContadorEtiqueta();
        String endLabel = "L" + getContadorEtiqueta();
        codJasmin += repLabel + ":\n";
        codJasmin += visit(ctx.expresion());
        codJasmin += "ldc 1\n";
        codJasmin += "if_icmpne " + endLabel + "\n";
        if (ctx.sentencia() != null){
            for (LinguineParser.SentenciaContext sentenciaContext : ctx.sentencia()) {
                codJasmin += visit(sentenciaContext);
            }
        }
        codJasmin += "goto " + repLabel + "\n";
        codJasmin += endLabel + ":\n";
        tablaSimbolos.popTabla();
        return codJasmin;
    }

    @Override
    public String visitCondicional(LinguineParser.CondicionalContext ctx) {
        tablaSimbolos.pushTabla();
        String codJasmin = "";
        TerminalNode elseNode = ctx.ELSE();
        List<TerminalNode> elseifNodes = ctx.ELSEIF();
        List<LinguineParser.ExpresionContext> expresiones =  ctx.expresion();
        int etiquetaSalto = getContadorEtiqueta();
        if (expresiones.size() == 1 && elseNode == null) {//if sin else
            codJasmin += visit(expresiones.get(0));
            codJasmin += "ldc 1\n";
            codJasmin += "if_icmpne L" + etiquetaSalto + "\n";
            codJasmin += visit(ctx.sentencia(0));
            codJasmin += "L" + etiquetaSalto + ":\n";
        } else if (expresiones.size() == 1 && elseifNodes.isEmpty()) {//if con else
            int etiquetaElse = getContadorEtiqueta();
            codJasmin += visit(expresiones.get(0));
            codJasmin += "ldc 1\n";
            codJasmin += "if_icmpne L" + etiquetaElse + "\n";
            codJasmin += visit(ctx.sentencia(0));
            codJasmin += "goto L" + etiquetaSalto + "\n";
            codJasmin += "L" + etiquetaElse + ":\n";
            codJasmin += visit(ctx.sentencia(1));
            codJasmin += "L" + etiquetaSalto + ":\n";
        }else if (elseNode == null) {//if con elseif sin else
            int[] etiquetasElseIf = new int[elseifNodes.size()];
            for (int i = 0; i < elseifNodes.size(); i++) {
                etiquetasElseIf[i] = getContadorEtiqueta();
            }
            codJasmin += visit(expresiones.get(0));
            codJasmin += "ldc 1\n";
            codJasmin += "if_icmpne L" + etiquetasElseIf[0] + "\n";
            codJasmin += visit(ctx.sentencia(0));
            codJasmin += "goto L" + etiquetaSalto + "\n";
            for (int i = 0; i < elseifNodes.size()-1; i++) {
                codJasmin += "L" + etiquetasElseIf[i] + ":\n";
                codJasmin += visit(expresiones.get(i));
                codJasmin += "ldc 1\n";
                int siguienteSalto = etiquetasElseIf.length-1 == i ? etiquetaSalto : etiquetasElseIf[i+1];
                codJasmin += "if_icmpne L" + siguienteSalto + "\n";
                codJasmin += visit(ctx.sentencia(i+1));
                codJasmin += "goto L" + etiquetaSalto + "\n";
            }
            codJasmin += "L" + etiquetaSalto + ":\n";
        }else{//if con elseif y else
            int[] etiquetasElseIf = new int[elseifNodes.size()];
            int etiquetaElse = getContadorEtiqueta();
            for (int i = 0; i < elseifNodes.size(); i++) {
                etiquetasElseIf[i] = getContadorEtiqueta();
            }
            codJasmin += visit(expresiones.get(0));//bloque if
            codJasmin += "ldc 1\n";
            codJasmin += "if_icmpne L" + etiquetasElseIf[0] + "\n";
            codJasmin += visit(ctx.sentencia(0));
            codJasmin += "goto L" + etiquetaSalto + "\n";
            for (int i = 0; i < elseifNodes.size(); i++) {//itera sobre los elseif
                codJasmin += "L" + etiquetasElseIf[i] + ":\n";//bloque elseif
                codJasmin += visit(expresiones.get(i+1));
                codJasmin += "ldc 1\n";
                int siguienteSalto = etiquetasElseIf.length-1 == i ? etiquetaElse : etiquetasElseIf[i+1];
                codJasmin += "if_icmpne L" + siguienteSalto + "\n";
                codJasmin += visit(ctx.sentencia(i+1));
                codJasmin += "goto L" + etiquetaSalto + "\n";
            }
            codJasmin += "L" + etiquetaElse + ":\n";//bloque else
            codJasmin += visit(ctx.sentencia(ctx.sentencia().size()-1));
            codJasmin += "L" + etiquetaSalto + ":\n";
        }
        tablaSimbolos.popTabla();
        return codJasmin;
    }

    @Override
    public String visitFuncion(LinguineParser.FuncionContext ctx) {
        //TODO: Completar esta cagada
        String codJasmin = "";
        codJasmin += ".method public static "+ctx.ID().getText()+"(";
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
                if (tablaSimbolos.existeSimbolo(ctx.expresion().getText())) {
                    tipo = tablaSimbolos.getSimbolo(ctx.expresion().getText()).getTipo();
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
                case "BOOLEAN":
                    codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
                    codJasmin += visit(ctx.expresion());
                    codJasmin += "invokevirtual java/io/PrintStream/println(I)V\n";
                    break;
            }
        } else {
            //TODO gestionar cuando hay varias cosas
            /** Se asume que si hay varias cosas, es un int (gestionar mas tarde si da tiempo) **/
            codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
            codJasmin += visit(ctx.expresion());
            codJasmin += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
        }

        return codJasmin;
    }

    @Override
    public String visitMatch(LinguineParser.MatchContext ctx) {
        //TODO: Programar el match, posible cambio en la gramatica
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
    public String visitBoolean(LinguineParser.BooleanContext ctx) {
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
        //TODO: Añadir resto de concatencaiones y gestionar cuando se suman ID
        String codJasmin = "";
        codJasmin += visit(ctx.getChild(0));
        codJasmin += visit(ctx.getChild(2));
        if (obtenerTipo(ctx.expresion(0)).equals("STRING") && obtenerTipo(ctx.expresion(1)).equals("STRING") && ctx.getChild(1).getText().equals("+")){
            codJasmin += "invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;\n";
        }else if (obtenerTipo(ctx.expresion(0)).equals("INT") && obtenerTipo(ctx.expresion(1)).equals("INT")){
            if (ctx.getChild(1).getText().equals("+")) {
                codJasmin += "iadd\n";
            } else {
                codJasmin += "isub\n";
            }
        } else if (obtenerTipo(ctx.expresion(0)).equals("FLOAT") && obtenerTipo(ctx.expresion(1)).equals("FLOAT")){
            if (ctx.getChild(1).getText().equals("+")) {
                codJasmin += "fadd\n";
            } else {
                codJasmin += "fsub\n";
            }
        }else{
            System.out.println("Error: no se pueden sumar o restar tipos distintos.");
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
        switch (ctx.getChild(1).getText()) {
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
        String etiqueta1 = "L" + getContadorEtiqueta();
        codJasmin += etiqueta1 + "\n";
        codJasmin += "ldc 0\n";
        String etiqueta2 = "L" + getContadorEtiqueta();
        codJasmin += "goto " + etiqueta2 + "\n";
        codJasmin += etiqueta1 + ":\n";
        codJasmin += "ldc 1\n";
        codJasmin += etiqueta2+":\n";
        return codJasmin;
    }

    @Override
    public String visitId(LinguineParser.IdContext ctx) {
        String codJasmin = "";
        if (!(ctx.getParent() instanceof LinguineParser.DeclaracionContext) && !(ctx.getParent() instanceof LinguineParser.AsignacionContext)) {
            if (tablaSimbolos.existeSimbolo(ctx.getText())) {
                int iVar = tablaSimbolos.getSimbolo(ctx.getText()).getiVar();

                switch (tablaSimbolos.getSimbolo(ctx.getText()).getTipo()){
                    case "INT":
                        codJasmin += "iload "+iVar+"\n";
                        break;
                    case "STRING":
                        codJasmin += "aload "+iVar+"\n";
                        break;
                    case "FLOAT":
                        codJasmin += "fload "+iVar+"\n";
                        break;
                    case "BOOLEAN":
                        codJasmin += "iload "+iVar+"\n";
                        break;
                    case "ID":
                        codJasmin += "iload "+iVar+"\n";
                        break;
                    case "CODIGO":
                        codJasmin += tablaSimbolos.getSimbolo(ctx.getText()).getCodigo()+"\n";
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
    public String visitArgs(LinguineParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    private int contadorEtiqueta = 1;//0 reservado
    private int getContadorEtiqueta(){
        //Genera etiquetas unicas para cada condicional
        return contadorEtiqueta++;
    }

    private String obtenerTipo(ParserRuleContext ctx){
        //obtiene el tipo del primer nodo terminalque se encuentre
        ParseTree tree = ctx;
        while (tree.getChildCount() > 0){
            tree = tree.getChild(0);
        }
        TerminalNode terminalNode = (TerminalNode) tree;
        String tipo = "";
        int tipoToken = terminalNode.getSymbol().getType();
        tipo = parser.VOCABULARY.getSymbolicName(tipoToken);
        return tipo;
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
