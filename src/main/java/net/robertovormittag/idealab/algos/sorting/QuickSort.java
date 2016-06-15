
package net.robertovormittag.idealab.algos.sorting;

public class QuickSort {

    // initially call with left=0, right=array.length - 1
    public static void sort(int arr[], int left, int right) {

        // base case
        if (arr.length < 2) return;

        // partition the range into two halves
        int pivot = partition(arr, left, right);
        // recursively sort first half
        if (left < pivot - 1) { sort(arr, left, pivot - 1); }
        // recursively sort second half
        if (pivot < right) { sort(arr, pivot, right); }

    }

    /**
     *
     * @param arr the array to partition
     * @param left the left index, starting with 0
     * @param right the right index starting with array.length - 1
     * @return
     */
    private static int partition(int arr[], int left, int right) {

        // the left index
        int L = left;
        // the right index
        int R = right;
        // used for swapping elements
        int tmp;

        // pick an element from the mid range
        // call it the pivot
        int pivot = arr[(left + right) / 2];

        // while left index <= right index
        while (L <= R) {

            // keep incrementing L while element < pivot
            while (arr[L] < pivot) { L++; }
            // keep decrementing R while element > pivot
            while (arr[R] > pivot)  { R--; }
            // swap elements if left index is <= right index
            if (L <= R) {
                tmp = arr[L];
                arr[L] = arr[R];
                arr[R] = tmp;
                // increment left and decrement right
                L++;
                R--;
            }

        };

        // return the new left index
        return L;

    }


}
