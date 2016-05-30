package net.robertovormittag.idealab.structures.nodes;

public class Node<E> {

    // instance variables
    private E element;
    private Node<E> next;

    public E getElement() {
        return element;
    }
    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }

}
