package net.robertovormittag.idealab.temp;

public class LinkedList {

    private Node head;


    public void add(Comparable data) {

        // construct new node to add
        Node newNode = new Node();
        newNode.setData(data);


        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while(current != null) {
            // found last node in list
            if (current.getNext() == null) {
                current.setNext(newNode);
                return;
            }

            current = current.getNext();

        }

    }


    public void delete(Comparable data) {

        // nothing to delete
        if (head == null) { return; }

        int comp = head.getData().compareTo(data);

        if (comp == 0) {
            // change head
            head = head.getNext();
        }

        Node current = head;
        Node previous = null;

        while(current != null) {

            comp = current.getData().compareTo(data);

            // match found
            if (comp == 0) {
                // remove current
                previous.setNext(current.getNext());
            }

            previous = current;
            current = current.getNext();
        }


    }



    public String toString() {

        Node current = head;
        StringBuffer sb = new StringBuffer();

        while (current != null) {
            sb.append("[" + current.getData() + "]");
            if (current.getNext() != null) {
                sb.append(" -> ");
            }
            current = current.getNext();
        }

        return sb.toString();
    }


}
