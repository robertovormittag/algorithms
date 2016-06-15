package net.robertovormittag.idealab.temp;

class Node {

    private Comparable data;
    private Node next;

    // setters
    public void setData(Comparable data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    // getters
    public Comparable getData() {
        return this.data;
    }
    public Node getNext() {
        return this.next;
    }

}
