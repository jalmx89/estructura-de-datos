package com.estructura.datos.search;

import com.estructura.datos.busqueda.binaria.SearchBinary;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by josef on 8/20/17.
 */
public class SearchBinaryTest {

    @Test
    public void searchBinaryTest() {
        double[] arr = {1, 2, 3, 4, 5, 6};
        double key = 4;

        int actual = 3;
        int expected = SearchBinary.search(arr, key, 0, arr.length);

        assertEquals("Fail search. no found", expected, actual, 0);
    }
}
