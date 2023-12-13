package org.uah;

public class Variable {
    private String tipo;
    private Object[] valor;

    public Variable(String tipo, Object[] valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo(){
        return this.tipo;
    }

    public Object[] getValor(){
        return this.valor;
    }

    public void updateValor(Object[] valor){
        this.valor = valor;
    }
}
