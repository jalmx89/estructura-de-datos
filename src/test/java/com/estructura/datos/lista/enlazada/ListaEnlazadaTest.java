package com.estructura.datos.lista.enlazada;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ListaEnlazadaTest {

    @Test
    public void nodoTest() {
        Nodo nodo1 = new Nodo("Primer nodo");
        Nodo nodo2 = new Nodo("Segundo nodo");
        Nodo nodo3 = new Nodo(3);

        nodo1.enlazarSiguiente(nodo2);
        nodo1.obtenerSiguiente().enlazarSiguiente(nodo3);

        System.out.println(nodo1.obtenerElemento());
        System.out.println(nodo1.obtenerSiguiente().obtenerElemento());
        System.out.println(nodo2.obtenerSiguiente().obtenerElemento());

        assertEquals("NodoDoble 1 enlazado con NodoDoble 2 fallido",
                nodo2.obtenerElemento(),
                nodo1.obtenerSiguiente().obtenerElemento());

        assertEquals("NodoDoble 2 enlazado con NodoDoble 3 fallido",
                nodo3.obtenerElemento(),
                nodo2.obtenerSiguiente().obtenerElemento());

        assertNull("Tiene un enlace", nodo3.obtenerSiguiente());
    }

    @Test
    public void tamanioListaTest(){
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        int listaVacia = 0;

        assertEquals("No esta vacia la lista", true, listaEnlazada.estaVacia());
        assertEquals("Lista tiene elementos",listaVacia, listaEnlazada.obtenerTamanioLista());
    }

    @Test
    public void listaTest(){
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        String texto1 = "Estructura de datos";
        String texto2 = "Sotavento";
        listaEnlazada.insertarPrimero( texto1);
        listaEnlazada.insertarPrimero(texto2);
        listaEnlazada.insertarPrimero(100);

        assertEquals(100, listaEnlazada.obtenerElemento(0));
        assertEquals(texto2, listaEnlazada.obtenerElemento(1));
        assertEquals(texto1, listaEnlazada.obtenerElemento(2));

    }

    @Test
    public void removiendoPrimerElementoListaTest(){
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        String texto1 = "Estructura de datos";
        String texto2 = "Sotavento";
        String texto3 = "ISC";
        String texto4 = "Mensaje";

        listaEnlazada.insertarPrimero( texto1);//5
        listaEnlazada.insertarPrimero(texto2);//4
        listaEnlazada.insertarPrimero(texto3);//3
        listaEnlazada.insertarPrimero(texto4); //2
        listaEnlazada.insertarPrimero(100);//1
        listaEnlazada.insertarPrimero(200); //0

        System.out.println("Primer elemento de la lista: " + listaEnlazada.obtenerElemento(0));

        listaEnlazada.removerPrimero();

        assertEquals("Fallo removiendo el primer elemento de la lista",
                100, listaEnlazada.obtenerElemento(0));
    }

    @Test
    public void removiendoElementosListaTest(){
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        String texto1 = "Estructura de datos";
        String texto2 = "Sotavento";

        listaEnlazada.insertarPrimero( texto1);//3
        listaEnlazada.insertarPrimero(texto2);//2
        listaEnlazada.insertarPrimero(100);//1
        listaEnlazada.insertarPrimero(200); //0

        System.out.println("Posición 2: " + listaEnlazada.obtenerElemento(2));
        assertEquals(texto2, listaEnlazada.obtenerElemento(2));

        listaEnlazada.remover(2); //estaria removiendo el texto2

        assertEquals("No removio el elemento 2",texto1, listaEnlazada.obtenerElemento(2));
        System.out.println("Posición 2: " + listaEnlazada.obtenerElemento(2));
    }


    @Test(expected = NullPointerException.class)
    public void eliminardoTodoListaTest(){
        ListaEnlazada listaEnlazada = new ListaEnlazada();

        listaEnlazada.insertarPrimero(100);
        listaEnlazada.insertarPrimero(200);

        System.out.println("Tamaño de la lista: " + listaEnlazada.obtenerTamanioLista());

        listaEnlazada.removerTodo();

        assertNull("No esta vacia", listaEnlazada.obtenerElemento(0));
    }

}
