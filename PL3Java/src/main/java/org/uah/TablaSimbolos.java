package org.uah;

import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {
    private Map<String, Simbolo> tablaSimbolos;
    public TablaSimbolos(){
        tablaSimbolos = new HashMap<>();
    }

    public void addVariable(String nombre,String tipo, int iVar, String clase, Object valor, String codigo){
        tablaSimbolos.put(nombre, new Simbolo(tipo,iVar,clase,valor,codigo));
    }
    public void addVariable(String nombre,Simbolo simbolo){
        tablaSimbolos.put(nombre, simbolo);
    }

    public void updateVariable(String nombre,String tipo, int iVar, Object valor, String codigo){
        tablaSimbolos.get(nombre).updateVariable(tipo,iVar,valor,codigo);
    }

    public Simbolo getSimbolo(String nombre){
        return tablaSimbolos.get(nombre);
    }

    public boolean existeSimbolo(String nombre){
        return tablaSimbolos.containsKey(nombre);
    }
    public void printTabla(){
        for (Map.Entry<String, Simbolo> entry : tablaSimbolos.entrySet()) {
            System.out.println(entry);
        }
    }
    public TablaSimbolos clone(){
        TablaSimbolos tablaSimbolos = new TablaSimbolos();
        for (Map.Entry<String, Simbolo> entry : this.tablaSimbolos.entrySet()) {
            tablaSimbolos.addVariable(entry.getKey(),entry.getValue().clone());
        }
        return tablaSimbolos;
    }
}
