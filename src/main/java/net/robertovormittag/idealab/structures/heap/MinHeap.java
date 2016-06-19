package net.robertovormittag.idealab.structures.heap;


import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    private List<Comparable> nodes;

    // constructor
    public MinHeap() {
        nodes = new ArrayList<Comparable>();
        // set first element to null
        nodes.add(null);
    }

    // add a new node
    public void add(Comparable newNode) {

        // add a new leaf
        nodes.add(null);
        // index of new leaf
        int index = nodes.size() - 1;

        //TODO: complete method
    }

    public int size() {
        return nodes.size() -1;
    }

    public Comparable getLeftChild(int index) {
        return nodes.get(2*index);
    }

    public Comparable getRightChild(int index) {
        return nodes.get(2*index + 1);
    }

    public Comparable getParent(int index) {
        return nodes.get(index / 2);
    }


    public Comparable peek() {
        return nodes.get(1);
    }

    public Comparable remove() {
        //TODO: complete method
        return null;
    }


    // fix the head following a removal
    private void fixHeap() {

        Comparable root = nodes.get(1);
        int lastIndex = nodes.size() - 1;

        //TODO complete this method

    }








}
