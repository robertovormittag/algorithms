package net.robertovormittag.idealab.algos.numbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinChangeTest {

    @Before
    public void setUp() throws Exception {

        CoinChange.reset();
    }

    @After
    public void tearDown() throws Exception {
        CoinChange.reset();
    }

    @Test
    public void testGreedy() throws Exception {
        CoinChange.greedy(1.73);
        System.out.println(CoinChange.RESULT.toString());
    }

    @Test
    public void test() throws Exception {

    }
}
