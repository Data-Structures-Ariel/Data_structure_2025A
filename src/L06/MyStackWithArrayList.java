package L06;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStackWithArrayList<E> {

    private ArrayList<E> items;

    //O(1)
    public MyStackWithArrayList() {
        items = new ArrayList<>(10);
    }

    //O(n)
    public E push(E item) {
        if (!items.add(item))
            throw new IndexOutOfBoundsException();
        return item;
    }

    //O(1) with MyArrayList from L05
    //O(n) with java.util.ArrayList
    public E pop() {
        if (items.isEmpty())
            throw new EmptyStackException();

//        try {
//            return items.remove(items.size() - 1);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("EmptyStackException");
//            throw new EmptyStackException();
//        }

        return items.remove(items.size() - 1);
    }

    //O(1)
    public E peek() {
        if (empty())
            throw new EmptyStackException();
        return items.get(items.size() - 1);

    }

    //O(1)
    public boolean empty() {
        return items.isEmpty();
    }

    //O(n)
    public int search(E item) {
        if (empty())
            return -1;
        int inx = items.lastIndexOf(item);
        return (inx == -1) ? -1 : items.size() - inx;
    }
}
