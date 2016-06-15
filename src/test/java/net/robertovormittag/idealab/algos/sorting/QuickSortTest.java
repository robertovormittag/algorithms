package net.robertovormittag.idealab.algos.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testSort() {

        int[] array = { 8, 9, 6, 7, 4, 5, 3, 1, 2 };
        QuickSort.sort(array, 0, array.length - 1);

        // verify
        System.out.println("Quick sort:");
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

    }
}
