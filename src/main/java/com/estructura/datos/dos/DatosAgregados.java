package com.estructura.datos.dos;

import java.util.Arrays;
import java.util.HashMap;


/**
 * Created by josef on 8/9/17.
 * 01 Diferentes formas de datos
 */
public class DatosAgregados {

    private DatosAgregados() {
    }

    public static int[] arreglos() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Arreglo:");
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static String  cadenas() {
        String cadena = "Estructura de datos";

        System.out.println("Cadena:");
        System.out.println(cadena);
        return cadena;
    }

    public static HashMap registros() {
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
        return registro;
    }
}
