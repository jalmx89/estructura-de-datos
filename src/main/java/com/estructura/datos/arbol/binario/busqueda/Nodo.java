package com.estructura.datos.arbol.binario.busqueda;

public class Nodo{

        private Object dato;
        private Nodo izquierdo;
        private Nodo derecho;

        public Nodo(Object valor){
            this.dato = valor;
        }

        public Nodo(Nodo ramaIzqu, Object valor, Nodo ramaDer ){
            this.derecho = ramaDer;
            this.izquierdo = ramaIzqu;
            this.dato = valor;
        }

        public Object valorNodo() {
            return dato;
        }

        public Nodo subArbolDerecho() {
            return derecho;
        }

        public Nodo subArbolIzquierdo() {
            return izquierdo;
        }

        public void nuevoValor(Object valor){
            this.dato = valor;
        }

        public void ramaIzquierda(Nodo izquierdo){
            this.izquierdo = izquierdo;
        }

        public void ramaDerecha(Nodo derecho){
            this.derecho = derecho;
        }

    }