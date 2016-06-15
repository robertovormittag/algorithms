package net.robertovormittag.idealab.temp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoTest {

    private Algo algo;

    @Before
    public void setUp() throws Exception {
        algo = new Algo();
    }

    @After
    public void tearDown() throws Exception {
        algo = null;
    }

    @Test
    public void testSumArray() {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[0];
        int result = algo.sumElements(arr);
        System.out.println("Result is " + result);
    }

    @Test
    public void testCompute() throws Exception {
        char[] array = algo.compute();
        int index = 0;
        for (char c : array) {
            System.out.print("[" + c + "]");
        }
        System.out.println();

    }
}
