package net.robertovormittag.idealab.algos;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Top-Down Merge-Sort of Object Arrays
 */
public class MergeSort {
    
    /**
     *
     * @param sequence
     * @param comp
     * @param <T>
     */
    public static <T> void sort(T[] sequence, Comparator<T> comp) {

        int length = sequence.length;
        // already sorted
        if (length < 2) return;
        // split in the middle
        int mid = length/2;
        // half left
        T[] left = Arrays.copyOfRange(sequence, 0, mid);
        // half right
        T[] right = Arrays.copyOfRange(sequence, mid, length);
        // copy of second half
        // conquer (with recursion)
        sort(left, comp);                      // sort copy of first half
        sort(right, comp);                      // sort copy of second half
        // merge results
        merge(left, right, sequence, comp);               // merge sorted halves back into original
    }


    /**
     *
     * @param left
     * @param right
     * @param sequence
     * @param comp
     * @param <T>
     */
    private static <T> void merge(T[] left, T[] right, T[] sequence, Comparator<T> comp) {

        int ileft = 0;
        int iright = 0;

        while (ileft + iright < sequence.length) {

            if (iright == right.length || (ileft < left.length && comp.compare(left[ileft], right[iright]) < 0)) {
                // copy ith element of left and increment ileft
                sequence[ileft+iright] = left[ileft++];
            }
            else {
                // copy jth element of right and increment iright
                sequence[ileft + iright] = right[iright++];
            }
        }
    }

}
