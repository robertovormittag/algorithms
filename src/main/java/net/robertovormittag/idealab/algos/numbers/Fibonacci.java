
package net.robertovormittag.idealab.algos.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

    // count the number of operations
    public static int COUNTER;
    // hold the fibonacci sequence
    public static List<Integer> NUMBERS = new ArrayList<>();
    // reset counter and list
    public static void reset() {
        COUNTER = 0;
        NUMBERS.clear();
    }

    /**
     * performs in linear time O(n)
     */
    public static int iterativeMethod(int n) {
        int prev=0, next=1, result=0;

        for (int i = 1; i < n; i++) {
            result = prev + next;
            prev = next;
            next = result;
            NUMBERS.add(result);
            COUNTER++;
        }

        return result;
    }


    /**
     * performs in exponential time
     *
     */
    public static int binaryRecursion(int n) {
        int result;

        if (n <= 1) {
            result = n;
        }
        else {
            result = binaryRecursion(n-1) + binaryRecursion(n-2);
        }
        NUMBERS.add(result);
        COUNTER++;
        return result;
    }


    /**
     *
     * Dynamic programming solution
     * (memoization or top-down approach
     *
     * Store already calculated values
     * to avoid duplicating efforts
     *
     */
    public static int dynamicProgramming(int n) {

        // map to store results
        Map<Integer, Integer> computedValues = new HashMap<>();
        // the two base cases
        computedValues.put(1, 1);
        computedValues.put(2, 1);

        return dynamicProgramming(n, computedValues);
    }

    private static int dynamicProgramming(int n, Map<Integer,Integer> computedValues) {

        if (computedValues.containsKey(n)) return computedValues.get(n);

        computedValues.put(n-1, dynamicProgramming(n-1, computedValues));
        computedValues.put(n-2, dynamicProgramming(n-2, computedValues));

        int result = computedValues.get(n-1) + computedValues.get(n-2);
        computedValues.put(n, result);

        NUMBERS.add(result);
        COUNTER++;

        return result;
    }


}
