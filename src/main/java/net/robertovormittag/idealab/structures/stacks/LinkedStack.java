package net.robertovormittag.idealab.structures.stacks;


import net.robertovormittag.idealab.structures.nodes.Node;

public class LinkedStack<E> implements Stack<E> {

    // instance variables
    private Node<E> top;
    private int size;

    // constructor
    public LinkedStack() {
        top = null;
        size = 0;
    }

    // returns size
    @Override
    public int size() {
        return size;
    }

    /**
     * Stack is empty when top is null
     * @return
     */
    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    /**
     * add element at the top of the stack
     *
     * @param element
     */
    @Override
    public void push(E element) {

        // create a new node
        Node<E> newNode = new Node<>();
        // set node element to be the element being pushed
        newNode.setElement(element);
        // set next in the chain to be current top
        newNode.setNext(top);
        // set top to be the new node
        top = newNode;
        // increase size
        size++;
    }

    /**
     * return and remove the element at the top of the stack
     *
     * @return
     */
    @Override
    public E pop() {

        // first check is stack is empty
        if (isEmpty()) throw new EmptyStackException("Stack is empty");
        // store the top element in a variable to return
        E element = top.getElement();
        // set top to the next top element
        top = top.getNext();
        // the old top is no longer referenced
        // decrease size
        size--;
        // return the element that was on top
        return element;
    }

    /**
     * return but does not remove the element at the top of the stack
     *
     * @return
     */
    @Override
    public E top() {
        // first check is stack is empty
        if (isEmpty()) throw new EmptyStackException("Stack is empty");
        return top.getElement();
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[]";
        StringBuffer sb = new StringBuffer();
        Node<E> current = top;
        while(current != null) {
            sb.append("[" + current.getElement().toString() + "]" + '\n');
            current = current.getNext();
        }
        return sb.toString();
    }

}
