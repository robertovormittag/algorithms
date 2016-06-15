package net.robertovormittag.idealab.structures.nodes;

public class SNode {

    private Comparable data;
    private SNode next;

    // setters
    public void setData(Comparable data) {
        this.data = data;
    }
    public void setNext(SNode next) {
        this.next = next;
    }

    // getters
    public Comparable getData() {
        return this.data;
    }
    public SNode getNext() {
        return this.next;
    }

}
