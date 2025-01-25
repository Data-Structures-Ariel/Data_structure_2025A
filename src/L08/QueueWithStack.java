package L08;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class QueueWithStack<E> implements Queue<E> {

    private Stack<E> st;


    public QueueWithStack() {
        this.st = new Stack<>();
    }

    @Override
    public int size() {
        return st.size();
    }

    @Override
    public boolean isEmpty() {
        return st.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return st.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
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
        return st.push(e) == e;
    }

    @Override
    public boolean remove(Object o) {
        if (isEmpty())
            return false;

        Stack<E> temp = new Stack<>();
        while (!st.isEmpty())
            temp.push(st.pop());

        temp.pop();

        while (!temp.isEmpty())
            st.push(temp.pop());

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
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
