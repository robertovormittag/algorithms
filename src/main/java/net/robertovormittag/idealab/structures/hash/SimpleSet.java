package net.robertovormittag.idealab.structures.hash;

import java.util.Iterator;

public interface SimpleSet {

    // Adds the specified element to this set if it is not already present
    boolean add(Object element);
    // Removes the specified element from this set if it is present
    boolean remove(Object element);
    // Returns true if this set contains the specified element
    boolean contains(Object element);
    // Returns an iterator over the elements in this set
    Iterator iterator();
    // Returns the number of elements in this set
    int size();

}
