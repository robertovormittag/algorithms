package net.robertovormittag.idealab.temp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class HashSetTest {

    private HashSet set;


    @Before
    public void setUp() throws Exception {
        set = new HashSet(128);

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testContains() throws Exception {

        set.add("Apple");
        assertTrue(set.contains("Apple"));
        assertTrue(set.getSize() == 1);

    }

    @Test
    public void testAdd() throws Exception {

    }
}