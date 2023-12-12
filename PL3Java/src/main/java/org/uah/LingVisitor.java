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
                    tablaSimbolos.updateVariable(ctx.ID().getText(), Integer.parseInt(ctx.getChild(2).getText()));
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
                    System.out.println("La variable "+ctx.ID().getText()+" es de tipo desconocido y su valor es "+tablaSimbolos.getVariable(ctx.ID().getText()).getValor());
                    break;
            }

        }else{
            System.out.println("Error: la variable "+ctx.ID().getText()+" no fue declarada.");
        }
        return super.visitAsigSimple(ctx);
    }

    @Override
    public String visitProgram(LinguineParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public String visitSentencia(LinguineParser.SentenciaContext ctx) {
        return super.visitSentencia(ctx);
    }

    @Override
    public String visitDeclaracion(LinguineParser.DeclaracionContext ctx) {
        return super.visitDeclaracion(ctx);
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
        return super.visitCondicional(ctx);
    }

    @Override
    public String visitFuncion(LinguineParser.FuncionContext ctx) {
        return super.visitFuncion(ctx);
    }

    @Override
    public String visitParams(LinguineParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public String visitShow(LinguineParser.ShowContext ctx) {
        return super.visitShow(ctx);
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
        return super.visitFloat(ctx);
    }

    @Override
    public String visitBool(LinguineParser.BoolContext ctx) {
        return super.visitBool(ctx);
    }

    @Override
    public String visitLlamadaFuncion(LinguineParser.LlamadaFuncionContext ctx) {
        return super.visitLlamadaFuncion(ctx);
    }

    @Override
    public String visitMulDiv(LinguineParser.MulDivContext ctx) {
        return super.visitMulDiv(ctx);
    }

    @Override
    public String visitAddSub(LinguineParser.AddSubContext ctx) {
        return super.visitAddSub(ctx);
    }

    @Override
    public String visitParentesis(LinguineParser.ParentesisContext ctx) {
        return super.visitParentesis(ctx);
    }

    @Override
    public String visitRel(LinguineParser.RelContext ctx) {
        return super.visitRel(ctx);
    }

    @Override
    public String visitId(LinguineParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override
    public String visitString(LinguineParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public String visitAndOr(LinguineParser.AndOrContext ctx) {
        return super.visitAndOr(ctx);
    }

    @Override
    public String visitInt(LinguineParser.IntContext ctx) {
        return super.visitInt(ctx);
    }

    @Override
    public String visitLlamada_funcion(LinguineParser.Llamada_funcionContext ctx) {
        return super.visitLlamada_funcion(ctx);
    }
}
