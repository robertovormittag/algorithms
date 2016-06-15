package net.robertovormittag.idealab.structures.hash;

import net.robertovormittag.idealab.structures.nodes.Entry;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class GenericHashSet<E> implements GenericSet<E> {

    private static final Logger log = Logger.getLogger(GenericHashSet.class.getName());

    private Entry<E>[] buckets;

    private int size;
    @Override
    public int size() {
        return size;
    }

    /**
     *
     * @param capacity
     */
    public GenericHashSet(int capacity) {

        buckets = new Entry[capacity];
        size = 0;
    }

    /**
     *
     * @param hashCode
     * @return
     */
    private int hashFunction(int hashCode) {
        if (hashCode < 0) { hashCode = -hashCode; }
        return hashCode % buckets.length;
    }

    /**
     *
     * @param element
     * @return
     */
    @Override
    public boolean contains(E element) {

        int index = hashFunction(element.hashCode());
        Entry current = buckets[index];

        while (current != null) {
            // check if node contains element
            if (current.getKey().equals(element)) { return true; }
            // otherwise visit next node in the bucket
            current = current.getNext();
        }
        // no element found
        return false;
    }


    /**
     *
     * @param element
     * @return
     */
    @Override
    public boolean add(E element) {

        int index = hashFunction(element.hashCode());
        log.info(element.toString() + " hashCode=" + element.hashCode() + " index=" + index);
        Entry current = buckets[index];

        while (current != null) {
            // element is already in set
            if (current.getKey().equals(element)) { return false; }
            // otherwise visit next entry in the bucket
            current = current.getNext();
        }
        // no element found so add new entry
        Entry entry = new Entry<E>();
        entry.setKey(element);
        // current Entry is null if bucket is empty
        // if it is not null it becomes next Entry
        entry.setNext(buckets[index]);
        buckets[index] = entry;
        size++;
        return true;
    }

    /**
     *
     * @param element
     * @return
     */
    @Override
    public boolean remove(E element) {

        int index = hashFunction(element.hashCode());
        Entry current = buckets[index];
        Entry previous = null;

        while (current != null) {
            // element found so remove it
            if (current.getKey().equals(element)) {

                if (previous == null) {
                    buckets[index] = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                return true;
            }

            previous = current;
            current.setNext(current.getNext());
        }
        // no element found nothing to remove
        return false;
    }


    @Override
    public String toString() {

        Entry currentEntry = null;
        StringBuffer sb = new StringBuffer();

        if (buckets.length == 0) {
            return "[]";
        }

        // loop through the array
        for (int index=0; index < buckets.length; index++) {
            // we have an entry
            if (buckets[index] != null) {
                currentEntry = buckets[index];
                sb.append("[" + index + "]");
                sb.append(" " + currentEntry.getKey().toString());
                while (currentEntry.getNext() != null) {
                    currentEntry = currentEntry.getNext();
                    sb.append(" -> " + currentEntry.getKey().toString());
                }
                sb.append('\n');
            }
        }

        return sb.toString();
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator iterator() {
        return new GenericHashSetIterator();
    }


    /**
     * A simple iterator for this Set
     */
    class GenericHashSetIterator implements Iterator {

        private int currentBucket;
        private int previousBucket;
        private Entry currentEntry;
        private Entry previousEntry;


        public GenericHashSetIterator() {
            currentEntry = null;
            previousEntry = null;
            currentBucket = -1;
            previousBucket = -1;

        }

        /**
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {

            // currentEntry node has next
            if (currentEntry != null && currentEntry.getNext() != null) { return true; }

            // there are still nodes
            for (int index = currentBucket+1; index < buckets.length; index++) {
                if (buckets[index] != null) { return true; }
            }

            // nothing left
            return false;
        }

        /**
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Object next() {

            previousEntry = currentEntry;
            previousBucket = currentBucket;

            // if either the current or next node are null
            if (currentEntry == null || currentEntry.getNext() == null) {

                // go to next bucket
                currentBucket++;

                // keep going until you find a bucket with a node
                while (currentBucket < buckets.length &&
                        buckets[currentBucket] == null) {
                    // go to next bucket
                    currentBucket++;
                }

                // if bucket array index still in bounds
                // make it the current node
                if (currentBucket < buckets.length) {
                    currentEntry = buckets[currentBucket];
                }
                // otherwise there are no more elements
                else {
                    throw new NoSuchElementException();
                }
            }
            // go to the next element in bucket
            else {

                currentEntry.setNext(currentEntry.getNext());
            }

            // return the element in the current node
            return currentEntry.getKey();

        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}
