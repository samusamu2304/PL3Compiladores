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
        Object valor = null;
        String tipo = "desconocido";
        try {
            //Comprueba si es un numero, si no, se comprueba si es una cadena
            valor = Integer.parseInt(ctx.getChild(3).getText());
            tipo = "int";
        }catch (NumberFormatException e){
            //Comprueba si es una cadena, si no, no se sabe lo que es aun
            if (ctx.getChild(3).getText().charAt(0) == '"' && ctx.getChild(3).getText().charAt(ctx.getChild(3).getText().length()-1) == '"'){
                valor = ctx.getChild(3).getText();
                tipo = "string";
            }
        }
        //añade la variable a la tabla de simbolos, si ya existe, la actualiza
        tablaSimbolos.addVariable(ctx.ID().getText(), tipo, valor);
    }
}
