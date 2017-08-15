package com.estructura.datos.uno;

/**
 * Created by josef on 8/8/17.
 * 00 Clase para demostracion de clases envolturas para tipos primitivos
 */
public class Envoltura {

    /**
     * Las clases envoltura de tipo numerico heredan de la clase @Number y final
     */
    public static void main(String[] args) {

        /**Numericos*/
        Integer entero = new Integer(Integer.MAX_VALUE); //usando la clase envoltura para enteros
        Double doble = new Double(Double.MAX_VALUE);//usando la clase envoltura para dobles
        Float flotante = new Float(Float.MAX_VALUE);
        Byte bite = new Byte(Byte.MAX_VALUE);
        Short corto = new Short(Short.MAX_VALUE);
        Long largo = new Long(Long.MAX_VALUE);


        Character caracter = new Character('A');

        Object[] envolturas = {entero, doble, flotante, bite, corto, largo, caracter};

        for (Object e : envolturas) {

            System.out.println("Tipo: " + e.getClass().getSimpleName() + ", Valor: " + e);
        }
    }
}
