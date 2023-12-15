package org.uah;

import linguine.LinguineParser;
import linguine.LinguineParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;

public class TreeListener extends LinguineParserBaseListener
{
    TablaSimbolos tablaSimbolos;
    public TreeListener(TablaSimbolos tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }


    @Override
    public void enterDeclaracion(LinguineParser.DeclaracionContext ctx) {

    }
}
