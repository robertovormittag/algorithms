package net.robertovormittag.idealab.temp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    private Tree tree;
    private Tree tree2;

    @Before
    public void setUp() throws Exception {
        tree = new Tree();
        tree.add("Mango");
        tree.add("Apple");
        tree.add("Pineapple");

        tree2 = new Tree();
        tree2.add("M");
        tree2.add("C");
        tree2.add("P");
        tree2.add("E");
        tree2.add("R");
        tree2.add("S");
        tree2.add("A");
        tree2.add("X");
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
        tree2 = null;
    }

    @Test
    public void testInOrder() throws Exception {
        tree.resetList();
        tree.inOrderTraversal(tree.getRoot());
        System.out.println(tree.getList());
    }

    @Test
    public void smallestElement() throws Exception {
        TNode current = tree2.getRoot();
        String smallest = null;
        while (current != null) {
            smallest = current.getKey().toString();
            System.out.println(smallest);
            current = current.getLeft();
        }
        System.out.println("Smallest element is: " + smallest);
    }

    @Test
    public void largestElement() throws Exception {
        TNode current = tree2.getRoot();
        String largest = null;
        while (current != null) {
            largest = current.getKey().toString();
            System.out.println(largest);
            current = current.getRight();
        }
        System.out.println("Largest element is: " + largest);
    }

    @Test
    public void testInOrder2() throws Exception {
        tree2.resetList();
        tree2.inOrderTraversal(tree2.getRoot());
        System.out.println(tree2.getList());
    }


    @Test
    public void testPreOrder() throws Exception {
        tree.resetList();
        tree.preOrderTraversal(tree.getRoot());
        System.out.println(tree.getList());
    }

    @Test
    public void testPostOrder() throws Exception {
        tree.resetList();
        tree.postOrderTraversal(tree.getRoot());
        System.out.println(tree.getList());
    }

}
