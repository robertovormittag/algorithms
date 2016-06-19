package net.robertovormittag.idealab.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataFileTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testReadNumbers() throws Exception {

        int[] numbers = DataFile.readNumbers("numbers.txt", 24);

        for (int n: numbers) {
            System.out.print("[" + n + "]");
        }

    }
}
