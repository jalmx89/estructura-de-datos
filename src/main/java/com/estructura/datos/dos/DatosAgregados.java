package com.estructura.datos.dos;

import java.util.Arrays;
import java.util.HashMap;


/**
 * Created by josef on 8/9/17.
 * 01 Diferentes formas de datos
 */
public class DatosAgregados {

    public static void main(String[] args) {
        System.out.println("------------------");
        arreglos();
        System.out.println("------------------");
        cadenas();
        System.out.println("------------------");
        registros();
        System.out.println("------------------");
    }

    public static void arreglos() {
        int[] arr = {4, 6, 7, 8, 9, 34, 23};
        System.out.println("Arreglo:");
        System.out.println(Arrays.toString(arr));
    }

    public static void cadenas() {
        String cadena = "Estructura de datos";

        System.out.println("Cadena:");
        System.out.println(cadena);
    }

    public static void registros() {
        System.out.println("Registros:");

        HashMap registro = new HashMap();

        registro.put("entero", 4);
        registro.put("flotante", 4.4f);
        registro.put("dobles", 432.43);
        registro.put("cadenas", "Es una cadena en un registro");
        registro.put("arreglo", Arrays.toString(new int[]{5, 23, 58, 54, 78, 6, 5}));

        for (Object entry : registro.entrySet()) {
            System.out.println(entry);
        }
    }
}
