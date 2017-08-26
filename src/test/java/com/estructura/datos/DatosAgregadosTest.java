package com.estructura.datos;

import com.estructura.datos.dos.DatosAgregados;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by josef on 8/15/17.
 */

public class DatosAgregadosTest {

    @Test
    public void arrayTest() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = DatosAgregados.arreglos();

        assertArrayEquals("Comparacion de arrays", expected, actual);
    }

    @Test
    public void cadenaTest(){
        String actual = "Estructura de datos";
        String expected = DatosAgregados.cadenas();

        assertEquals("Comparaciond de cadenas", expected, actual);
    }
}
