package net.robertovormittag.idealab.algos.numbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
        Factorial.reset();
    }

    @After
    public void tearDown() throws Exception {
        Factorial.reset();
    }

    @Test
    public void testRecursive() throws Exception {

        int result = Factorial.recursive(4);
        System.out.println("Recursive result = " + result + " counter = " + Factorial.COUNTER);
        System.out.println("Results = " + Factorial.RESULTS);

    }

    @Test
    public void testIterative() throws Exception {

        int result = Factorial.iterative(4);
        System.out.println("Iterative result = " + result + " counter = " + Factorial.COUNTER);
        System.out.println("Results = " + Factorial.RESULTS);

    }



}