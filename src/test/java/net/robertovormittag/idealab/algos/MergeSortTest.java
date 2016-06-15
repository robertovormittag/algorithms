package net.robertovormittag.idealab.algos;

import net.robertovormittag.idealab.domain.NaturalComparator;
import net.robertovormittag.idealab.util.Chronos;
import net.robertovormittag.idealab.util.DataGenerator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;

/**
 * Test Merge-Sort Implementation
 * Compare performance against JDK library implementation
 */
public class MergeSortTest {
	
	private static final Logger log = Logger.getLogger(MergeSortTest.class.getName());
	// default comparator
    private static Comparator<Integer> comp;
    // timer class
    private static Chronos timer;

    // test data
    private Integer[] arr1;
    private Integer[] arr6;

    @BeforeClass
    public static void setupClass() {
        comp = new NaturalComparator<Integer>();
        timer = new Chronos();
    }
    
    @Before
    public void setup() {
        arr1 = DataGenerator.generateIntegerArray(10, 100);
        arr6 = DataGenerator.generateIntegerArray(1000000, 10000000);
    }


    @Test
    public void arr6MultiThreadedTest() {
        timer.reset();
        timer.start();
        Arrays.parallelSort(arr6, comp);
        timer.stop();
        log.info("Elapsed time: " + timer.getElapsedTime());
        assertTrue(true);
    }
    
    @Test
    public void arr6SingleThreadedTest() {
        timer.reset();
        timer.start();
        Arrays.sort(arr6, comp);
        timer.stop();
        log.info("Elapsed time: " + timer.getElapsedTime());
        assertTrue(true);
    }

    @Test
    public void arr6Test() {
        timer.reset();
        timer.start();
        MergeSort.sort(arr6, comp);
        timer.stop();
        log.info("Elapsed time: " + timer.getElapsedTime());
        assertTrue(true);
    }
    

    @Ignore
    public void arr1LibraryTest() {
        timer.reset();
        timer.start();
        Arrays.sort(arr1, comp);
        timer.stop();
        log.info(Arrays.toString(arr1));
        log.info("Elapsed time: " + timer.getElapsedTime());
        assertTrue(true);
    }

    @Ignore
    public void arr1Test() {
        timer.reset();
        timer.start();
        MergeSort.sort(arr1, comp);
        timer.stop();
        log.info(Arrays.toString(arr1));
        log.info("Elapsed time: " + timer.getElapsedTime());
        assertTrue(true);
    }


}
