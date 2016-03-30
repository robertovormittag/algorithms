package net.robertovormittag.idealab.util;

import org.junit.Test;
import java.util.Arrays;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * DataGenerator method tests
 */
public class DataGeneratorTest {
	
	private static final Logger log = Logger.getLogger(DataGeneratorTest.class.getName());

    @Test
    public void testGenerateIntegerArray() throws Exception {

        int len = 20;
        int max = 100;

        Integer[] arr = DataGenerator.generateIntegerArray(len, max);
        //log.info(Arrays.toString(arr));
        assertTrue(arr.length == len);

    }


    @Test
    public void testGenerateRandomIntArray() throws Exception {

        int len = 20;
        int max = 100;

        int[] arr = DataGenerator.generateIntArray(len, max);
        //log.info(Arrays.toString(arr));
        assertTrue(arr.length == len);

    }

}
