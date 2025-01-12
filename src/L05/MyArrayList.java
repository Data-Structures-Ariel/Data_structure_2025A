package L05;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    public MyArrayList(int capacity) {
        if (capacity <= 0)
            elementData = new Object[DEFAULT_CAPACITY];
        else if (capacity > 0)
            elementData = new Object[capacity];
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

    @Override
    public boolean contains(Object o) {
        if (isEmpty())
            return false;

        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        //optional
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (size == elementData.length)
            initial();
        elementData[size] = e;
        size++;
        return true;
    }

    private void initial() {
        Object[] temp = new Object[elementData.length * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = elementData[i];
        }
        elementData = temp;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty())
            return false;
        int i = 0;
        for (i = 0; i < size; i++) {
            if (elementData[i].equals(o))
                break;
        }

        if (i == size)
            return false;

        for (int j = i; j < size - 1; j++) {
            elementData[j] = elementData[j + 1];
        }
        size--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        //implement
    }

    @Override
    public E get(int index) {
        if (isEmpty())
            throw new IllegalArgumentException();
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        return (E) elementData[index];
    }

    @Override
    public E set(int index, E element) {
        //implement
        return null;
    }

    @Override
    public void add(int index, E element) {
        //implement
    }

    @Override
    public E remove(int index) {
        //implement
        return null;
    }

    @Override
    public int indexOf(Object o) {
        //implement
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        //implement
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
