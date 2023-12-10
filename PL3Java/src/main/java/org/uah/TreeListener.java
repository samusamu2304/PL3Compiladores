package org.uah;

import linguine.LinguineParser;
import linguine.LinguineParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

public class TreeListener extends LinguineParserBaseListener
{

    public TreeListener() {
    }
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void enterProgram(LinguineParser.ProgramContext ctx) {

    }

    @Override
    public void enterAsignacion(LinguineParser.AsignacionContext ctx) {
        System.out.println(ctx.getChild(1).getText()+" : "+ctx.getChild(3).getText());
    }
}
