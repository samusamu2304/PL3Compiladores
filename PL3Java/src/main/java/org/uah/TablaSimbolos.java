package org.uah;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {
    private Map<String, Simbolo> tablaSimbolos;
    private ArrayList<Map<String, Simbolo>> stackTablasSimbolos;
    public TablaSimbolos(){
        tablaSimbolos = new HashMap<>();
        stackTablasSimbolos = new ArrayList<>();
    }

    public void addVariable(String nombre,String tipo, int iVar, String clase, Object valor, String codigo){
        tablaSimbolos.put(nombre, new Simbolo(tipo,iVar,clase,valor,codigo));
    }
    public void addVariable(String nombre,Simbolo simbolo){
        tablaSimbolos.put(nombre, simbolo);
    }

    public void updateVariable(String nombre,String tipo, int iVar, Object valor, String codigo){
        getSimbolo(nombre).updateVariable(tipo,iVar,valor,codigo);
    }
    public void addFuncion(String nombre, int iVar, ArrayList<String> parametros, Object valor, String codigo){
        tablaSimbolos.put(nombre, new Simbolo("FUNCION",iVar,"funcion",parametros,valor,codigo));
    }

    public Simbolo getSimbolo(String nombre){
        Simbolo simbolo = null;
        if (tablaSimbolos.containsKey(nombre)){
            simbolo = tablaSimbolos.get(nombre);
        } else if (!stackTablasSimbolos.isEmpty()){
            for (int i = stackTablasSimbolos.size()-1; i >= 0; i--) {
                Map<String, Simbolo> tabla = stackTablasSimbolos.get(i);
                if (tabla.containsKey(nombre)){
                    simbolo = tabla.get(nombre);
                    break;
                }
            }
        }
        return simbolo;
    }

    public boolean existeSimbolo(String nombre){
        //Comprueba si existe en la tabla actual o en las anteriores
        boolean existe = false;
        if (tablaSimbolos.containsKey(nombre)){
            existe = true;
        } else if (!stackTablasSimbolos.isEmpty()){
            for (int i = stackTablasSimbolos.size()-1; i >= 0; i--) {
                Map<String, Simbolo> tabla = stackTablasSimbolos.get(i);
                if (tabla.containsKey(nombre)){
                    existe = true;
                    break;
                }
            }

        }
        return existe;
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
    public void pushTabla(){
        stackTablasSimbolos.add(tablaSimbolos);
        tablaSimbolos = new HashMap<>();
    }
    public void popTabla(){
        tablaSimbolos = stackTablasSimbolos.get(stackTablasSimbolos.size()-1);
        stackTablasSimbolos.remove(stackTablasSimbolos.size()-1);
    }
    public String getFunciones(){
        String funciones = "";
        for (Map.Entry<String, Simbolo> entry : tablaSimbolos.entrySet()) {
            if (entry.getValue().getClase().equals("funcion")){
                funciones += entry.getValue().getCodigo();
            }
        }
        return funciones;
    }
}
