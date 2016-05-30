package net.robertovormittag.idealab.structures.hash;

import org.junit.*;
import static org.junit.Assert.*;

public class GenericHashSetTest {

    private GenericSet<String> fruits;
    private GenericSet<Integer> numbers;
    private int capacity;

    @Before
    public void setUp() {
        capacity = 128;
        fruits = new GenericHashSet<String>(capacity);
        numbers = new GenericHashSet<>(capacity);
    }

    @After
    public void tearDown() {
        System.out.println(fruits.toString());
        System.out.println(numbers.toString());
    }


    @Test
    public void testChaining() {

        numbers.add(new Integer(capacity));
        numbers.add(new Integer(capacity * 2));
        numbers.add(new Integer(capacity * 3));

        numbers.add(new Integer(capacity + 10));
        numbers.add(new Integer(capacity * 2 + 10));
        numbers.add(new Integer(capacity * 3 + 10));

        numbers.add(new Integer(capacity + 20));
        numbers.add(new Integer(capacity * 2 + 20));
        numbers.add(new Integer(capacity * 3 + 20));

        assertTrue(numbers.size() == 9);
    }

    @Test
    public void testAdd() {

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("banana");
        assertTrue(fruits.size() == 2);

    }

    @Test
    public void testRemove() throws Exception {

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("papaya");
        fruits.add("pineapple");

        fruits.remove("apple");
        assertTrue(!fruits.contains("apple"));
        assertTrue(fruits.size() == 4);

    }

}
