package net.robertovormittag.idealab.temp;

public class Entry {

    private Object key;
    private Entry next;

    public void setKey(Object key) {
        this.key = key;
    }

    public void setNext(Entry next) {
        this.next = next;
    }

    public Object getKey() {
        return this.key;
    }

    public Entry getNext() {
        return this.next;
    }
}
