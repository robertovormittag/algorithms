package net.robertovormittag.idealab.domain;

import java.util.Comparator;

/**
 * Implements Comparable relying on the natural order
 */
public class NaturalComparator<T> implements Comparator<T> {

	@SuppressWarnings("unchecked")
	@Override
    public int compare(T obj1, T obj2) {
        return ((Comparable<T>) obj1).compareTo(obj2);
    }

}
