
package net.robertovormittag.idealab.algos.numbers;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    // count the number of operations
    public static int COUNTER;
    // hold the fibonacci sequence
    public static List<Integer> RESULTS = new ArrayList<>();
    // reset counter and list
    public static void reset() {
        COUNTER = 0;
        RESULTS.clear();
    }

    /**
     * performs in linear time
     * for n = 4
     * Iterative result = 24 counter = 4
     * Results = [1, 2, 6, 24]
     */
    public static int iterative(int n) {

        int result = 1;

        for (int factor = 1; factor <= n; factor++) {
            result = result * factor;
            COUNTER++;
            RESULTS.add(result);
        }

        return result;

    }

    /**
     * performs in linear time
     * for n = 4
     * Recursive result = 24 counter = 5
     * Results = [1, 1, 2, 6, 24]
     */
    public static int recursive(int n) {
        int result;

        if (n == 0) result = 1;
        else result = n * recursive(n - 1);

        COUNTER++;
        RESULTS.add(result);
        return result;
    }

}
