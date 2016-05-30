package net.robertovormittag.idealab.structures.lists;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DLinkedListTest {

    private DLinkedList<String> list;

    @Before
    public void setUp() throws Exception {
        list = new DLinkedList<>();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(list.toString());
    }

    @Test
    public void testAddFirst() throws Exception {
        list.addFirst("apple");
        list.addFirst("orange");
        list.addFirst("lemon");
    }

    @Test
    public void testAddLast() throws Exception {
        list.addLast("apple");
        list.addLast("orange");
        list.addLast("lemon");
    }

    @Test
    public void testRemoveFirst() throws Exception {
        list.addFirst("apple");
        list.addFirst("orange");
        list.addFirst("lemon");
        list.removeFirst();
    }

    @Test
    public void testRemoveLast() throws Exception {
        list.addLast("apple");
        list.addLast("orange");
        list.addLast("lemon");
        list.removeLast();
    }
}
