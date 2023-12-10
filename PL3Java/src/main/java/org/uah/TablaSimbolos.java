package org.uah;

import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {
    private Map<String, Variable> tablaSimbolos;
    public TablaSimbolos(){
        tablaSimbolos = new HashMap<>();
    }

    public void addVariable(String nombre,String tipo, Object valor){
        tablaSimbolos.put(nombre, new Variable(tipo,valor));
    }

    public void updateVariable(String nombre, Object valor){
        tablaSimbolos.get(nombre).updateValor(valor);
    }

    public Variable getVariable(String nombre){
        return tablaSimbolos.get(nombre);
    }

    public boolean existeVariable(String nombre){
        return tablaSimbolos.containsKey(nombre);
    }
    public void printTabla(){
        for (Map.Entry<String, Variable> entry : tablaSimbolos.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue().getTipo()+" : "+entry.getValue().getValor());
        }
    }
}
