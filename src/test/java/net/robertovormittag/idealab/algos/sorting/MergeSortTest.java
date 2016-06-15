package net.robertovormittag.idealab.algos.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testSort() throws Exception {

        int[] array = { 8, 9, 6, 7, 4, 5, 3, 1, 2 };
        MergeSort.sort(array);

        // verify
        System.out.println("Merge sort:");
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }

}
