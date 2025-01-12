package L07;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue implements Queue {

    private int[] items;
    private int size;

    public MyQueue(int capacity) {
        items = new int[capacity];
        size = 0;
    }

    public MyQueue() {
        items = new int[10];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //O(n)
    @Override
    public boolean contains(Object o) {

        for (int i = 0; i < size; i++) {
            if (o.equals(items[i]))
                return true;
        }

        return false;
    }

    //O(n)
    @Override
    public Object poll() {
        if (isEmpty())
            return null;

        int item = items[0];
        for (int i = 0; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        size--;
        return item;
    }

    //O(1)
    @Override
    public boolean add(Object o) {
        if (size == items.length)
            return false;

        items[size++] = (Integer) o;

        return true;
    }


    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }


    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
