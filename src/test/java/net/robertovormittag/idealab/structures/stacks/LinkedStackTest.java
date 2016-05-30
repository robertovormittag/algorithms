package net.robertovormittag.idealab.structures.stacks;

import org.junit.*;

import static org.junit.Assert.*;


public class LinkedStackTest {

    private Stack<String> stack;

    @Before
    public void setUp() {
        stack = new LinkedStack<String>();
    }

    @After
    public void tearDown() {
        System.out.println(stack.toString());

    }


    @Test
    public void testPush() {
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cranberry");
        assertTrue(stack.top().equals("Cranberry"));
    }


    @Test
    public void testSize() {
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cranberry");
        assertTrue(stack.size() == 3);
    }


    @Test
    public void testPop() {

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cranberry");
        int size = stack.size();
        String fruit = stack.pop();
        assertTrue(fruit.equals("Cranberry"));
        assertTrue(stack.size() == (size-1));

    }

}
