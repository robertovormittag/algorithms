package net.robertovormittag.idealab.structures.nodes;

public class DNode<E> {

    private E element;

    private DNode<E> prev;
    private DNode<E> next;

    public DNode(E e, DNode<E> p, DNode<E> n) {
        element = e;
        prev = p;
        next = n;
    }

    // public accessor methods
    public E getElement() { return element; }

    public DNode<E> getPrev() { return prev; }

    public DNode<E> getNext() { return next; }

    public void setPrev(DNode<E> p) { prev = p; }

    public void setNext(DNode<E> n) { next = n; }
}
