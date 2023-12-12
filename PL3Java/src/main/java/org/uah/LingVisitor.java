package org.uah;

import linguine.LinguineParser;
import linguine.LinguineParserBaseVisitor;

public class LingVisitor extends LinguineParserBaseVisitor<String> {
    TablaSimbolos tablaSimbolos;
    LinguineParser parser;
    public LingVisitor(TablaSimbolos tablaSimbolos, LinguineParser parser) {
        this.tablaSimbolos = tablaSimbolos;
        this.parser = parser;
    }
    @Override
    public String visitAsigSimple(LinguineParser.AsigSimpleContext ctx) {
        if (tablaSimbolos.existeVariable(ctx.ID().getText())){
            switch (tablaSimbolos.getVariable(ctx.ID().getText()).getTipo()){
                case "int":
                    if (ctx.getChild(2).getText().charAt(0) == '"'){
                        System.out.println("Error: la variable "+ctx.ID().getText()+" es de tipo int y no puede recibir una cadena.");
                        break;
                    } else {
                        try{
                            tablaSimbolos.updateVariable(ctx.ID().getText(), Integer.parseInt(ctx.getChild(2).getText()));}
                        catch (NumberFormatException e){
                            tablaSimbolos.addVariable(ctx.ID().getText(), "codigo", visit(ctx.getChild(2)));
                        }
                    }

                    break;
                case "string":
                    tablaSimbolos.updateVariable(ctx.ID().getText(), ctx.getChild(2).getText());
                    break;
                case "float":
                    System.out.println("La variable "+ctx.ID().getText()+" es de tipo float y su valor es "+tablaSimbolos.getVariable(ctx.ID().getText()).getValor());
                    break;
                case "bool":
                    System.out.println("La variable "+ctx.ID().getText()+" es de tipo bool y su valor es "+tablaSimbolos.getVariable(ctx.ID().getText()).getValor());
                    break;
                default:
                    Object valor = null;
                    String tipo = "desconocido";
                    try {
                        //Comprueba si es un numero, si no, se comprueba si es una cadena
                        valor = Integer.parseInt(ctx.getChild(2).getText());
                        tipo = "int";
                        //System.out.println(visit(ctx.getChild(3)));
                    }catch (NumberFormatException e){
                        //Comprueba si es una cadena, si no, no se sabe lo que es aun
                        if (ctx.getChild(2).getText().charAt(0) == '"' && ctx.getChild(3).getText().charAt(ctx.getChild(3).getText().length()-1) == '"'){
                            valor = ctx.getChild(3).getText();
                            tipo = "string";
                        }else {
                            valor = visit(ctx.getChild(2));
                            tipo = "codigo";
                        }
                    }
                    tablaSimbolos.addVariable(ctx.ID().getText(),tipo,valor);
                    break;
            }

        }else{
            System.out.println("Error: la variable " + ctx.ID().getText() + " no fue declarada.");
        }
        return super.visitAsigSimple(ctx);
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
        String tipo = "desconocido";
        try {
            //Comprueba si es un numero, si no, se comprueba si es una cadena
            valor = Integer.parseInt(ctx.getChild(3).getText());
            tipo = "int";
            //System.out.println(visit(ctx.getChild(3)));
        }catch (NumberFormatException e){
            //Comprueba si es una cadena, si no, no se sabe lo que es aun
            if (ctx.getChild(3).getText().charAt(0) == '"' && ctx.getChild(3).getText().charAt(ctx.getChild(3).getText().length()-1) == '"'){
                valor = ctx.getChild(3).getText();
                tipo = "string";
            }else {
                valor = visit(ctx.getChild(3));
                tipo = "codigo";
            }
        }
        //añade la variable a la tabla de simbolos, si ya existe, la actualiza
        tablaSimbolos.addVariable(ctx.ID().getText(), tipo, valor);
        return "";
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
        int etiquetaResultado = getContadorEtiqueta();
        String resultado = "istore_"+etiquetaResultado+"\n";
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
        codJasmin += "if_icmpne " + etiqueta1 + "\n";
        codJasmin += codRamaThen;
        codJasmin += resultado;
        codJasmin += "goto " + etiqueta2 + "\n";
        codJasmin += etiqueta1 + ":\n";
        codJasmin += codRamaElse;
        codJasmin += resultado;
        codJasmin += etiqueta2 + ":\n";
        // Unica manera decente que he encontrado para que al asignar una variable en un condicional, se guarde en la tabla de simbolos como debe
        for (int i = 0; i < ctx.sentencia().size(); i++){
                tablaSimbolos.addVariable(ctx.sentencia(i).getChild(0).getChild(0).getText(), "codigo","iload_"+etiquetaResultado+"\n");
        }
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
        codJasmin += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        codJasmin += visit(ctx.getChild(1));
        codJasmin += "invokevirtual java/io/PrintStream/println(I)V\n";
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
        if (!(ctx.getParent() instanceof LinguineParser.DeclaracionContext)) {
            if (tablaSimbolos.existeVariable(ctx.getText())) {
                if (tablaSimbolos.getVariable(ctx.getText()).getTipo().equals("int")) {
                    codJasmin += "ldc " + tablaSimbolos.getVariable(ctx.getText()).getValor() + "\n";
                } else if (tablaSimbolos.getVariable(ctx.getText()).getTipo().equals("string")) {
                    codJasmin += "ldc " + tablaSimbolos.getVariable(ctx.getText()).getValor() + "\n";
                } else if (tablaSimbolos.getVariable(ctx.getText()).getTipo().equals("codigo")) {
                    codJasmin += tablaSimbolos.getVariable(ctx.getText()).getValor();
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

    private int contadorEtiqueta = 0;
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
