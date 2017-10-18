package com.estructura.datos.arbol.binario.busqueda;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario() {
        raiz = null;
    }

    public boolean estaVacio(){
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo izquiedo, Object valor, Nodo derecho){
        return new Nodo(izquiedo, valor, derecho);
    }

}
