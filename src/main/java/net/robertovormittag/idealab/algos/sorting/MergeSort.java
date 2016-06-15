package net.robertovormittag.idealab.algos.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {

    public static void sort(int[] sequence) {

        int length = sequence.length;

        // already sorted
        if (length < 2) return;

        // split in the middle
        int mid = length/2;
        // half left
        int[] left = Arrays.copyOfRange(sequence, 0, mid);
        // half right
        int[] right = Arrays.copyOfRange(sequence, mid, length);
        // copy of second half

        // conquer (with recursion)
        sort(left);
        // sort copy of first half
        sort(right);
        // sort copy of second half
        // merge results
        merge(left, right, sequence);
        // merge sorted halves back into original
    }


    // merge two sorted arrays
    private static void merge(int[] left, int[] right, int[] sequence) {

        // index of left array
        int ileft = 0;
        // index of right array
        int iright = 0;

        // as long as index is within length
        while (ileft + iright < sequence.length) {

            // move the smaller element into the merged sequence
            if (iright == right.length || (ileft < left.length && left[ileft] < right[iright])) {
                sequence[ileft+iright] = left[ileft++];
            }
            else {
                sequence[ileft + iright] = right[iright++];
            }
        }
    }


}
