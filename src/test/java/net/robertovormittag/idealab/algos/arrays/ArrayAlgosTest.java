package net.robertovormittag.idealab.algos.arrays;

import net.robertovormittag.idealab.algos.numbers.Factorial;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAlgosTest {

    @Before
    public void setUp() throws Exception {
        ArrayAlgos.reset();
    }

    @After
    public void tearDown() throws Exception {
        ArrayAlgos.reset();
    }


    /**
     * performs in O(log(n))
     */
    @Test
    public void testBinarySearch() {
        int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = ArrayAlgos.binarySearch(array, 9);

        System.out.println("Result = " + index + " Counter = " + ArrayAlgos.COUNTER);

    }

    /**
     * performs in linear time O(n/2)
     */
    @Test
    public void testReverseArray() {

        int[] array = { 1, 2, 3, 4, 5 };
        int[] reversed = ArrayAlgos.reverseArray(array, 0, array.length - 1);

        System.out.println("Recursive array reversal");
        for (int i : reversed) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
        System.out.println("Results = " + ArrayAlgos.RESULTS + " Counter = " + ArrayAlgos.COUNTER);

    }

    /**
     * performs in linear time O(n)
     */
    @Test
    public void testLinearSum() {

        // array to sum
        int[] array = { 4, 3, 6, 2, 5 };
        // number of elements to sum
        int n = 5;

        int result = ArrayAlgos.linearSum(array, n);
        System.out.println("Recursive linear sum result = " + result + " counter = " + ArrayAlgos.COUNTER);
        System.out.println("Partial results = " + ArrayAlgos.RESULTS);

    }

}
