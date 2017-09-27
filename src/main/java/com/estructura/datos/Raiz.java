package com.estructura.datos;

import java.util.Scanner;

/**
 * Created by vaio on 27/09/17.
 */
public class Raiz {

    public static void main(String[] args) {

        System.out.println("valor");
        int r = new Scanner(System.in).nextInt();
        int x = 0;

        do {
            System.out.println("valor de x: " + x);
            x += 0.01;
        }while ((x * x) >= r);

        System.out.println("resultado: " + x);
    }
}
