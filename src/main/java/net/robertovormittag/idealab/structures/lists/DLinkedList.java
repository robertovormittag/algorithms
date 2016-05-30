package net.robertovormittag.idealab.structures.lists;


import net.robertovormittag.idealab.structures.nodes.DNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLinkedList<E> {

    // sentinels
    private DNode<E> head;
    private DNode<E> tail;

    // does not include sentinels
    private int size = 0;

    public DLinkedList() {
        head = new DNode<>(null, null, null);
        // tail is precede by head
        tail = new DNode<>(null, head, null);
        // head is followed by tail
        head.setNext(tail);
    }

    // public accessors
    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public E first() {
        if (isEmpty()) return null;
        return head.getNext().getElement();   // first element is beyond head
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getPrev().getElement();    // last element is before tail
    }

    // public mutators
    public void addFirst(E e) {
        addBetween(e, head, head.getNext());    // place just after the head
    }

    public void addLast(E e) {
        addBetween(e, tail.getPrev(), tail);  // place just before the tail
    }

    public E removeFirst() {
        if (isEmpty()) return null;                  // nothing to remove
        return remove(head.getNext());             // first element is beyond head
    }

    public E removeLast() {
        if (isEmpty()) return null;                  // nothing to remove
        return remove(tail.getPrev());            // last element is before tail
    }

    // private update methods
    private void addBetween(E e, DNode<E> predecessor, DNode<E> successor) {
        // create and link a new node
        DNode<E> newest = new DNode<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove(DNode<E> node) {
        DNode<E> predecessor = node.getPrev();
        DNode<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        DNode<E> walk = head.getNext();
        while (walk != tail) {
            sb.append(walk.getElement());
            walk = walk.getNext();
            if (walk != tail)
                sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }


    class DLinkedListIterator implements Iterator {

        private DNode<E> current;
        private DNode<E> previous;

        // constructor
        public DLinkedListIterator() {
            current = null;
            previous = null;
        }

        public boolean hasNext() {

            if (current == null) {
                return head != null;
            }
            else {
                return current.getNext() != null;
            }
        }


        // move the iterator to the next element in the list
        // return the data in that element
        // head -> APPLE -> BANANA -> MANGO -> tail
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            // need previous for remove operation
            previous = current;

            if (current == null) {
                current = head;
            }
            else {
                current = current.getNext();
            }
            return current.getElement();
        }


        // optional methods: add, remove, set


    }

}
