package org.uah;

import linguine.LinguineParser;

public class FuncVisitor extends LingVisitor{
    public FuncVisitor(TablaSimbolos tablaSimbolos, LinguineParser parser) {
        super(tablaSimbolos.clone(), parser);
    }
    public void addParam(String nombre){
    }

}
