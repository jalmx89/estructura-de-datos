package com.estructura.datos.tres;

import com.estructura.datos.util.Timer;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by josef on 8/9/17.
 */
public class TestTime {

    public static void main(String[] args) {
        int size = 10;
        int[] enteros = new int[size];

        Timer.startTime();

        for (int i = 0; i < size; i++){
            enteros[i] = new Random().nextInt(100);
        }
        Timer.endTime();

        System.out.println(Arrays.toString(enteros));
    }
}
