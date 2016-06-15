package net.robertovormittag.idealab.algos.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testSort() {

        int[] array = { 8, 9, 6, 7, 4, 5, 3, 1, 2 };
        InsertionSort.sort(array);

        // verify
        System.out.println("Insertion sort:");
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();

    }
}
