package net.robertovormittag.idealab.temp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlgoTest {

    private Algo algo;


    public char[] reverseString(char[] str, int start, int end) {

        if (start < end) {
            swap(str, start, end);
            reverseString(str, start+1, end-1);
        }

        return str;

    }
    private void swap(char[] str, int start, int end) {

        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
    }
    @Test
    public void test3() {

        String str = "hello";
        char[] reversed = reverseString(str.toCharArray(), 0, str.length()-1);
        for (char c : reversed) {
            System.out.print(c);
        }
        System.out.println();

    }




    private static void arraySplit(int arr[]) {

        int len = arr.length;
        int mid = arr.length / 2;

        int[] left = new int[mid];
        int[] right = new int[len-mid];

        // copy left
        for (int index=0; index < mid; index++) {
            left[index] = arr[index];
        }
        int j = 0;
        // copy right
        for (int index=mid; index < len; index++) {
            right[j] = arr[index];
            j++;
        }
        // loop
        for (int i : left) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
        // loop
        for (int i : right) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
    @Test
    public void test2() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        arraySplit(arr);
    }

    private static int recursive(int n) {

        int result;

        // you need something to STOP the recursion
        if (n == 0) result = 1;
        else result = n - recursive(n - 1);
        System.out.println(result);

        return result;
    }
    @Test
    public void test1() {
        recursive(3);
    }


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
