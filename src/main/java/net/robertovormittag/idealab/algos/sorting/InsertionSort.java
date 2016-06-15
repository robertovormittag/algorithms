
package net.robertovormittag.idealab.algos.sorting;

public class InsertionSort {

    public static void sort(int[] array) {

        int element, j;

        // begin with second element
        for (int index = 1; index < array.length; index++) {

            // extract element
            element = array[index];
            // find insertion location
            j = index;
            // move all larger elements one index up
            while (j > 0 && array[j-1] > element) {
                array[j] = array[j-1];
                // compare with previous element
                j--;
            }
            // insert the element
            array[j] = element;
        }
    }
}
