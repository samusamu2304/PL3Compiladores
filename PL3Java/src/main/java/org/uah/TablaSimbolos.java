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
    public void addFuncion(String nombre,String retorno, int iVar, ArrayList<String> parametros, Object valor, String codigo){
        tablaSimbolos.put(nombre, new Simbolo("FUNCION",iVar,retorno,parametros,valor,codigo));//retorno es la clase
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
        System.out.println("-------------------- Tabla de símbolos --------------------");
        System.out.println("      Nombre     |    Tipo    |    Clase    |    Valor     ");
        for (Map.Entry<String, Simbolo> entry : tablaSimbolos.entrySet()) {
            Simbolo s = entry.getValue();

            String str = String.format(" %-15s | %-10s | %-11s | %-10s\n",
                    entry.getKey(),
                    s.getTipo(),
                    s.getClase(),
                    !s.getValor().equals("funcion") ? s.getValor() : "...");
            System.out.println(str);
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
            if (entry.getValue().getTipo().equals("FUNCION")){
                funciones += entry.getValue().getCodigo();
            }
        }
        return funciones;
    }
}
