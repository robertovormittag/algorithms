package net.robertovormittag.idealab.structures.lists;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testDeleteMultiple() {

        LinkedList list = new LinkedList();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Banana");

        list.delete("Banana");

        System.out.println(list.toString());

    }

    @Test
    public void testDeleteLast() {

        LinkedList list = new LinkedList();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.delete("Mango");

        System.out.println(list.toString());

    }

    @Test
    public void testDeleteFirst() {

        LinkedList list = new LinkedList();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.delete("Apple");

        System.out.println(list.toString());

    }


    @Test
    public void testDeleteMiddle() {

        LinkedList list = new LinkedList();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        list.delete("Banana");

        System.out.println(list.toString());

    }

    @Test
    public void testAdd() {

        LinkedList list = new LinkedList();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println(list.toString());

    }

}