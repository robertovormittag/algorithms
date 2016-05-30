package net.robertovormittag.idealab.structures.stacks;


public interface Stack<E> {

    int size();

    boolean isEmpty();

    /**
     * add element at the top of the stack
     * @param element
     */
    void push(E element);

    /**
     * return and remove the element at the top of the stack
     * @return
     */
    E pop();

    /**
     * return but does not remove the element at the top of the stack
     * @return
     */
    E top();
}
