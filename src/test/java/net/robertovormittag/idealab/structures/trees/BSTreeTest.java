package net.robertovormittag.idealab.structures.trees;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTreeTest {

    private BSTree tree;

    @Before
    public void setUp() throws Exception {
        tree = new BSTree();
    }

    @After
    public void tearDown() throws Exception {
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
    }

    @Ignore
    //@Test
    public void testAdd() throws Exception {
        tree.add("Mango");
        tree.add("Papaya");
        tree.add("Apple");
        tree.add("Orange");
        tree.add("Lemon");
    }

    @Test
    public void testFind() throws Exception {
        tree.add(new Integer(24));
        tree.add(new Integer(12));
        tree.add(new Integer(6));
        tree.add(new Integer(48));
        tree.add(new Integer(36));
    }

    @Ignore
    //@Test
    public void testRemove() throws Exception {
        tree.add("Mango");
        tree.add("Papaya");
        tree.add("Apple");
        tree.add("Orange");
        tree.add("Lemon");

        tree.remove("Apple");
    }

}
