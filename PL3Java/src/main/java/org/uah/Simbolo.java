package org.uah;

import java.util.ArrayList;

public class Simbolo {
    private String tipo;
    private int iVar;
    private String clase;
    private ArrayList<String> parametros;
    //TODO: ver por que no se asignan bien estos dos
    private Object valor;
    private String codigo;
//constructor para funciones
    public Simbolo(String tipo, int iVar, String clase, ArrayList<String> parametros, Object valor, String codigo) {
        this.tipo = tipo;
        this.iVar = iVar;
        this.clase = clase;
        this.parametros = parametros;
        this.valor = valor;
        this.codigo = codigo;
    }
//constructor para variables
    public Simbolo(String tipo, int iVar, String clase, Object valor, String codigo) {
        this.tipo = tipo;
        this.iVar = iVar;
        this.clase = clase;
        this.valor = valor;
        this.codigo = codigo;
        this.parametros = null;
    }




    public String getTipo(){
        return this.tipo;
    }

    public Object getValor(){
        return this.valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getiVar() {
        return iVar;
    }

    public void setiVar(int iVar) {
        this.iVar = iVar;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<String> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<String> parametros) {
        this.parametros = parametros;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void updateVariable(String tipo, int iVar, Object valor, String codigo){
        this.tipo = tipo;
        this.iVar = iVar;
        this.valor = valor;
        this.codigo = codigo;
    }
    public String toString(){
        return this.tipo + " : " + this.iVar + " : " + this.clase + " : " + this.valor + " : " + this.codigo;
    }
    public Simbolo clone(){
        return new Simbolo(this.tipo,this.iVar,this.clase,this.parametros,this.valor,this.codigo);
    }
}
