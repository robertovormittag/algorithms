package net.robertovormittag.idealab.algos.numbers;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    @Before
    public void setup() {
        Fibonacci.reset();
    }

    @Test
    public void testIterativeMethod() throws Exception {

        int result = Fibonacci.iterativeMethod(9);
        System.out.println("Iterative test result = " + result + " Counter: " + Fibonacci.COUNTER);
        System.out.println("Numbers:" + Fibonacci.NUMBERS);
    }

    @Test
    public void testRecursiveMethod() throws Exception {

        int result = Fibonacci.binaryRecursion(9);
        System.out.println("Recursive test result = " + result + " Counter: " + Fibonacci.COUNTER);
        System.out.println("Numbers:" + Fibonacci.NUMBERS);
    }

    @Test
    public void testDynamicProgramming() throws Exception {

        int result = Fibonacci.dynamicProgramming(9);
        System.out.println("Dynamic test result = " + result + " Counter: " + Fibonacci.COUNTER);
        System.out.println("Numbers:" + Fibonacci.NUMBERS);
    }

}
