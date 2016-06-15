
package net.robertovormittag.idealab.algos.numbers;

import java.util.ArrayList;
import java.util.List;

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

}
