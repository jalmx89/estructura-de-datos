package com.estructura.datos.lista.doble;

import com.estructura.datos.lista.enlazada.Nodo;

public class NodoDoble extends Nodo{

    private Object elemento;
    private NodoDoble siguiente;
    private NodoDoble anterior;

    public NodoDoble(Object elemento) {
        super(elemento);
        this.elemento = elemento;
        this.siguiente = null;
        this.anterior = null;
    }

    public void enlazarSiguiente(NodoDoble nodoDoble) {
        this.siguiente = nodoDoble;

    }

    public void enlazarAnterior(NodoDoble nodoDoble) {
        this.anterior = nodoDoble;

    }

    public NodoDoble obtenerSiguiente() {
        return this.siguiente;
    }

    public NodoDoble obtenerAnterior() {
        return this.anterior;
    }

    public Object obtenerElemento() {
        return this.elemento;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + siguiente + '}';
    }
}
