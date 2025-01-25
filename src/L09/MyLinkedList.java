package L09;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;


    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

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

        return new Iterator<E>() {
            Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E item = current.getValue();
                current = current.getNext();
                return item;
            }


        };
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

        Node<E> lastNode = new Node<>(e);
        tail.setNext(lastNode);
        tail = lastNode;

//
//        tail.setNext(new Node<>(e));
//        tail = tail.getNext();
        size++;


        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty())
            return false;

        if (o.equals(head.getValue())) {
            head = head.next;

            if (size <= 2)
                tail = head;

            size--;
            return true;
        }

        Node<E> current = head;
        Node<E> prev = null;

        while (current != null) {
            if (o.equals(current.getValue())) {

                prev.setNext(current.getNext());
                size--;
                if (current == tail)
                    tail = prev;

                return true;
            }

            prev = current;
            current = current.getNext();

        }


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
        head = tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();


        Node<E> current = head;
        for (int i = 0; i < index; i++, current = current.getNext()) ;

        return current.getValue();

    }

    @Override
    public E set(int index, E element) {
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
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        // יש לממש את הפונקציה הנל בבית בצורה מלאה.
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


        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public Node(E value) {
            this.value = value;
            this.next = null;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
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
