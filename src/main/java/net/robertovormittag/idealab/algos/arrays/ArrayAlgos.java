
package net.robertovormittag.idealab.algos.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayAlgos {

    // count the number of operations
    public static int COUNTER;
    // hold the fibonacci sequence
    public static List<Integer> RESULTS = new ArrayList<>();
    // reset counter and list
    public static void reset() {
        COUNTER = 0;
        RESULTS.clear();
    }

    // non-instantiable
    private ArrayAlgos() {}

    /**
     *
     * @param array
     * @param valueToSearchFor
     * @return the index of the matching element or -1 if not found
     */
    public static int binarySearch(int[] array, int valueToSearchFor) {

        int left = 0;
        int right = array.length - 1;
        int mid = -1;
        int diff = -1;

        // [1][2][3][4][5]
        //  |     |     |
        // left  mid   right
        while (left <= right) {

            COUNTER++;

            mid = (left + right) / 2;
            diff = array[mid] - valueToSearchFor;

            // found!
            if (diff == 0) { return mid; }
            else if (diff < 0) { // value is greater so search right
                left = mid + 1;
            }
            else { // value is smaller so search left
                right = mid - 1;
            }

        }

        // not found
        return -1;
    }


    public static int[] reverseArray(int[] array, int start, int end) {

        if (start < end) {
            swap(array, start, end);
            reverseArray(array, start+1, end-1);
        }

        COUNTER++;
        RESULTS.add(array[start]);

        return array;

    }


    public static void swap(int[] array, int start, int end) {

        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

    }


    public static int linearSum(int[] array, int n) {

        int result;

        if (n == 1) { result = array[0]; }
        else { result = linearSum(array, n-1) + array[n-1]; }

        COUNTER++;
        RESULTS.add(result);

        return result;

    }


}
