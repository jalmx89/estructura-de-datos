package com.estructura.datos.lista.enlazada;

public class Nodo {

    private Object elemento;
    private Nodo siguiente;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.siguiente = null; //no tiene enlace a ningun elemento
    }

    public void enlazarSiguiente(Nodo nodo) {
        this.siguiente = nodo;

    }

    public Nodo obtenerSiguiente() {
        return this.siguiente;
    }

    public Object obtenerNodo() {
        return this.elemento;
    }

    @Override
    public String toString() {
        return "Nodo{" + siguiente + '}';
    }
}
