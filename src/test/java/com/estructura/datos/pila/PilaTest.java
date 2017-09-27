package com.estructura.datos.pila;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilaTest {

    private static Pila pila = new Pila(3);

    @BeforeClass
    public static void init() {

        pila.push(2);
        pila.push(4);
        pila.push(7);
    }


    @Test
    public void topTest() {

        assertEquals("No es igual al tope", 7, pila.peek());

    }

    @Test
    public void emptyTest() {

        Pila pilaLocal = new Pila(3);

        assertEquals("Pila no vacía", true, pilaLocal.isEmpty());

        pilaLocal.push(2);
        pilaLocal.push(4);
        pilaLocal.push(7);

        assertEquals("Pila vacía ", false, pilaLocal.isEmpty());

    }

    @Test
    public void popTest() {
        pila.pop();//saco al 7

        assertEquals("Fallo sacar el elemento", 4, pila.peek());

    }

    @Test
    public void peekTest() {

        assertEquals("No es igual al tope", 4, pila.peek());

    }

}
