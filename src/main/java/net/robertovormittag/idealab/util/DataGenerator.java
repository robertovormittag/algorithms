package net.robertovormittag.idealab.util;

import java.util.Random;

/**
 * Assorted array utilities
 */
public class DataGenerator {

    private static Random random = new Random();

    /**
     * Generates an array containing random Integer values
     *
     * @param length
     * @param max
     * @return
     */
    public static Integer[] generateIntegerArray(int length, int max) {

        Integer[] arr = new Integer[length];

        for (int index=0; index < arr.length; index++) {
            arr[index] = new Integer(random.nextInt(max));
        }

        return arr;
    }



    /**
     * Generates an array containing random int values
     *
     * @param length the length of the array
     * @param max the top integer value in the range
     * @return an array containing random integers between 0 and max-1
     */
    public static int[] generateIntArray(int length, int max) {

        int[] arr = new int[length];

        for (int index=0; index < arr.length; index++) {
            arr[index] = random.nextInt(max);
        }

        return arr;
    }

}
