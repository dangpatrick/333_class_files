package adts;

import java.util.Iterator;

/**
 * Represents an sorted (ascending) list of elements. The list should grow
 * to accommodate any number of elements.
 *
 * DO NOT EDIT THIS FILE!
 *
 * @param <T> the type of elements in the list (must be Comparable)
 *
 * @author Josh Archer
 * @version 1.0
 */
public interface IOrderedList<T extends Comparable<T>> extends ICollection<T>
{
    /**
     * Adds an element to the collection, while maintaining the order
     * of all elements in the collection.
     *
     * @param element the element to add
     */
    void add(T element);

    /**
     * Returns an element at the specified index.
     *
     * @param index an index in the list
     * @return an element in the list at the given index
     * @throws IndexOutOfBoundsException if given a negative index or
     * an index greater or equal to size()
     */
    T get(int index);

    /**
     * Returns elements in sorted (ascending) order from the
     * underlying list
     *
     * @return all elements in the stack, in sorted order
     */
    Iterator<T> iterator();
}
