package net.robertovormittag.idealab.temp;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testSort() throws Exception {

        int[] array = { 8, 5, 4, 9, 3, 0, 2, 1, 6, 7 };
        QuickSort.sort(array, 0, array.length-1);
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

    }
}
