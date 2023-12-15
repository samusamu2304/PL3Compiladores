package org.uah;

import linguine.LinguineParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class FuncVisitor extends LingVisitor{

    private ArrayList<String> parametros;
    public FuncVisitor(TablaSimbolos tablaSimbolos, LinguineParser parser) {
        super(tablaSimbolos, parser);
        parametros = new ArrayList<>();
        contadorEtiqueta = 0;//para asegurarse de que no se pisan las etiquetas de las funciones
    }
    public void addParametros(List<TerminalNode> parametros){
        for (int i = 0; i < parametros.size(); i++) {
            this.parametros.add(parametros.get(i).getText());
        }
        for (int i = 0; i < parametros.size(); i++) {
            tablaSimbolos.addVariable(this.parametros.get(i),"ID",getContadorEtiqueta(),"variable",null,"desconocido");
        }

    }



}
