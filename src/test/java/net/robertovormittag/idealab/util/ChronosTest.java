package net.robertovormittag.idealab.util;

import org.junit.Test;
import java.util.logging.Logger;
import static org.junit.Assert.*;

/**
 * Test Chronos functionality
 */
public class ChronosTest {
	
	private static final Logger log = Logger.getLogger(ChronosTest.class.getName());

    @Test
    public void testGetElapsedTime() throws Exception {

        long interval = 1000;
        Chronos timer = new Chronos();

        timer.start();
        Thread.sleep(interval);
        timer.stop();

        log.info("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
        assertTrue(timer.getElapsedTime() == interval);

        timer.reset();
        assertTrue(timer.getElapsedTime() == 0);

    }

}
