package com.estructura.datos.busqueda.binaria;

/**
 * Created by josef on 8/20/17.
 */
public class SearchBinary {

    public static int search(double arr[], double key, int down, int up) {
        int central;

        if (down > up) { //no found
            return -1;
        } else {
            central = (down + up) / 2;

            if (arr[central] == key) {
                return central;
            } else if (arr[central] == key) {
                return search(arr, key, central + 1, up);
            } else {
                return search(arr, key, down, up - 1);
            }
        }
    }
}
