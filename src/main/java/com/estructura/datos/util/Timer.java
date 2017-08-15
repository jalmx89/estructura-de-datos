package com.estructura.datos.util;

public class Timer {

    private static long timeStart;

    private Timer() {
    }

    public static void startTime() {
        timeStart = System.currentTimeMillis();
    }

    public static void endTime() {
        long timeEnd = System.currentTimeMillis();
        System.out.println("Tardo: "+(timeEnd - timeStart) + " mS");
    }
}
