package com.estructura.datos.lista.doble;

public class ListaDoblementeEnlazada {

    private NodoDoble cabeza; //el primer elemento de la lista
    private int tamanio;

    public ListaDoblementeEnlazada() {
        iniciarLista();
    }

    public boolean estaVacia() {

        if (cabeza == null) {
            return true;
        } else {
            return false;
        }

    }

    public void insertarPrimero(Object elemento) {

        if (cabeza == null) { //si esta pasando un nodo por primera vez, se carga al inicio por default
            cabeza = new NodoDoble(elemento);
        } else {//si ya lista ya contiene elementos, se necesita agregar antes del primero actual, para que sea la nueva cabeza
            NodoDoble temporal = cabeza; //movemos la cabeza actual, a un nodo temporal
            NodoDoble nuevo = new NodoDoble(elemento); //genero el nuevo nodo, que se esta agregando
            nuevo.enlazarSiguiente(temporal); //enlazo el nodo que era el primero con el nuevo
            cabeza = nuevo; //hago el nuevo nodo, la cabeza de la lista
        }
        tamanio++; //se incrementa y el valor se vuele 0
    }

    public int obtenerTamanioLista() {
        return this.tamanio;
    }

    public Object obtenerElemento(int posicion) {

        if (posicion > tamanio) { // si pasan una posicion mayor al tamaño de la lista, lanza excepción
            throw new ArrayIndexOutOfBoundsException("No existe la posición");
        }

        int contador = 0; //inicializo el contador en 0
        NodoDoble temporal = cabeza; // cargo en un nodo temporal la cabeza de la lista para comenzar la iteracion

        while (contador < posicion) {
            temporal = temporal.obtenerSiguiente(); // hara la iteracion hasta que
            contador++; //incremento mi contador
        }

        return temporal.obtenerElemento();
    }

    public void removerPrimero() {
        cabeza = cabeza.obtenerSiguiente(); //traigo la posicion siguiente de la cabeza y lo sustituyo,
        // y ahora el que tenia la posicion 1, pasa a ser 0 y la anterior cabeza fue reemplaza

        tamanio--; //dismiyo el tamaño de la lista
    }

    public int remover(int posicion) {

        if (posicion > tamanio) { //si me pasan una posicion que exceda el tamaño de la lista, lanza Error
            throw new ArrayIndexOutOfBoundsException("No existe esa posicion");
        }

        if (posicion == 0) { //si me pasaron la primera posicion, remuevo la cabeza y para al siguiente
            removerPrimero();
            return posicion;
        } else {//si es alguna otra posicion, se reempleza ese enlace
            int contador = 0; //inicializo mi contador
            NodoDoble temporal = cabeza; //paso la cabeza temporal para iterarlo

            while (contador < posicion - 1) {//me pongo una posicion antes del posicion que quiero eliminar para sustituir ese enlace
                temporal = temporal.obtenerSiguiente(); //voy recorriendo mis elementos de la lista
                contador++; //incremento mi contador hasta llegar a mi elemento
            }

            temporal.enlazarSiguiente( //reemplaso el enlace con la posicion que se esta eliminando
                    temporal.obtenerSiguiente().obtenerSiguiente()
            );
            tamanio--; //desminuyo el tamaño de mi lista
        }

        return posicion; //retorno la posicion que me dieron a eliminar
    }

    public void removerTodo() {
        iniciarLista();
    }

    private void iniciarLista(){
        this.cabeza = null; // iniciamos la lista vacía
        this.tamanio = 0; //indica que esta vacia la lista
    }
}
