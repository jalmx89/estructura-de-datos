package com.estructura.datos.pila;

/**
 * Created by josef on 8/15/17.
 * Clase que con la estructura de datos PILA
 */
public class Pila {

    private final int tamanioMaximo; //tamaño maximo de mi pila
    private int positionTope;   //es el puntero a la posicion actual
    private Object[] elementos; //array de los elementos de mi pila

    public Pila(int tamanioMaximo) {
        this.tamanioMaximo = tamanioMaximo;
        this.positionTope = 0;
        this.elementos = new Object[tamanioMaximo];
    }

    public boolean empty() {

        if (positionTope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Object elemento) {

        if (positionTope < tamanioMaximo) {
            elementos[positionTope] = elemento;
            positionTope++;
        }

    }

    public Object pop() {
        Object e = null;

        if (positionTope > 0) {
            e = elementos[positionTope - 1];
            elementos[positionTope - 1] = null;
            positionTope--;
        }

        return e;
    }

    public Object peek() {

        if (positionTope > 0) {
            return elementos[positionTope - 1];
        }

        return null;
    }
}
