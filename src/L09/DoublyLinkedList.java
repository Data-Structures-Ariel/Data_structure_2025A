package L09;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoublyLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
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
        if (head == null) {
            head = tail = new Node<E>(e);
            return true;
        }

        Node<E> lastNode = new Node<>(e,null,tail);
        tail.setNext(lastNode);
        tail = lastNode;

        size++;

        return true;
    }


    @Override
    public boolean remove(Object o) {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
        return false;
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

    }

    @Override
    public E get(int index) {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
        return null;
    }

    @Override
    public E set(int index, E element) {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
        return null;
    }

    @Override
    public void add(int index, E element) {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
    }

    @Override
    public E remove(int index) {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
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

    private static class Node<E> {

        private E value;
        private Node<E> next;
        private Node<E> prev;


        public Node(E value, Node<E> next, Node<E> prev) {
            this.value = value;
            this.next = next;
        }


        public Node(E value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> next) {
            this.prev = next;
        }

        public boolean hasPrev() {
            return this.prev != null;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        @Override
        public String toString() {
            return
                    "{value = " + value + " next } --> " + next;
        }

    }
}
