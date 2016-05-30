package net.robertovormittag.idealab.structures.hash;

import org.junit.*;

import java.util.Iterator;
import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * toString()
 *
 * [1] banana -> apple
 * [2] mango
 * [3] kiwi -> papaya
 *
 *
 */

public class SimpleHashSetTest {

    private static final Logger log = Logger.getLogger(SimpleHashSetTest.class.getName());

    private static SimpleSet fruits;
    private static SimpleSet numbers;

    @BeforeClass
    public static void setUp() throws Exception {

        fruits = new SimpleHashSet(128);

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");


        numbers = new SimpleHashSet(128);
        numbers.add(new Integer(128));
        numbers.add(new Integer(256));
    }

    @AfterClass
    public static void tearDown() throws Exception {

        log.info("Final size of set is: " + fruits.size());
        log.info("Final size of set is: " + numbers.size());

        Iterator iter = fruits.iterator();
        Iterator iter2 = numbers.iterator();
        while(iter.hasNext()) {
            System.out.print("[" + iter.next() + "]");
        }
        System.out.println();
        System.out.println(fruits.toString());
        while(iter2.hasNext()) {
            System.out.print("[" + iter2.next() + "]");
        }
        System.out.println();
        System.out.println(numbers.toString());
    }


    @Test
    public void testCollisions() throws Exception {


        numbers.add(new Integer(138));
        numbers.add(new Integer(266));
        numbers.add(new Integer(394));


        numbers.add(new Integer(148));
        numbers.add(new Integer(276));

        assertTrue(numbers.contains(new Integer(138)));
        assertTrue(numbers.contains(new Integer(266)));
        assertTrue(numbers.contains(new Integer(394)));
        assertTrue(numbers.contains(new Integer(148)));
        assertTrue(numbers.contains(new Integer(276)));

        numbers.remove(new Integer(128));
        assertFalse(numbers.contains(new Integer(128)));
    }


    @Test
    public void testContains() throws Exception {
        assertTrue(fruits.contains("orange"));
    }


    @Test
    public void testAddElement() throws Exception {
        int previousSize = fruits.size();
        fruits.add("papaya");
        assertTrue(fruits.contains("papaya"));
        int currentSize = fruits.size();
        assertTrue(currentSize == previousSize+1);
    }

    @Test
    public void testAddDuplicate() throws Exception {
        int previousSize = fruits.size();
        fruits.add("orange");
        int currentSize = fruits.size();
        assertTrue(currentSize == previousSize);
    }

    @Test
    public void testSize() throws Exception {
        int previousSize = fruits.size();
        fruits.add("kiwi");
        int currentSize = fruits.size();
        assertTrue(currentSize == previousSize+1);
    }

    @Test
    public void testRemove() throws Exception {
        fruits.remove("apple");
        assertFalse(fruits.contains("apple"));
    }


    @Test
    public void testIterator() throws Exception {

        Iterator iter = fruits.iterator();
        while(iter.hasNext()) {
            if (iter.next().equals("banana")) {
                iter.remove();
            }
        }
    }

}
