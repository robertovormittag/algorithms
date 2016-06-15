package net.robertovormittag.idealab.temp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    private Tree tree;

    @Before
    public void setUp() throws Exception {
        tree = new Tree();
        tree.add("Mango");
        tree.add("Apple");
        tree.add("Pineapple");
    }

    @After
    public void tearDown() throws Exception {
        tree = null;
    }

    @Test
    public void testInOrder() throws Exception {
        tree.resetList();
        tree.inOrderTraversal(tree.getRoot());
        System.out.println(tree.getList());
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
