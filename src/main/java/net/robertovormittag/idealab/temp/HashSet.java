package net.robertovormittag.idealab.temp;

public class HashSet {

    private Entry[] bucket;

    private int size;
    public int getSize() {
        return size;
    }


    // constructor
    public HashSet(int capacity) {
        bucket = new Entry[capacity];
        size = 0;
    }

    private int hashFunction(Object object) {

        int hash = object.hashCode();
        if (hash < 0) { hash = -hash; }
        return hash % bucket.length;

    }


    public boolean contains(Object object) {

        int index = hashFunction(object);
        Entry current = bucket[index];

        while(current != null) {

            if (current.getKey().equals(object)) {
                return true;
            }

            current = current.getNext();
        }

        return false;

    }



    public boolean add(Object object) {

        int index = hashFunction(object);
        Entry current = bucket[index];

        while(current != null) {

            if (current.getKey().equals(object)) {
                return false;
            }

            current = current.getNext();
        }

        // current is null now do not use it
        Entry newEntry = new Entry();
        newEntry.setKey(object);
        newEntry.setNext(bucket[index]);
        bucket[index] = newEntry;

        size++;
        return true;

    }


}
