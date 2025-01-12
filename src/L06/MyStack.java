package L06;

import java.util.EmptyStackException;


public class MyStack {

    private int[] items;
    private int size;

    //O(1)
    public MyStack() {
        items = new int[10];
        size = 0;
    }

    //O(1)
    public int push(int item) {
        if (size >= items.length)
            throw new IndexOutOfBoundsException();
        items[size++] = item;
        return item;
    }

    //O(1)
    public int pop() {
        if (empty())
            throw new EmptyStackException();
        return items[--size];
    }

    //O(1)
    public int peek() {
        if (empty())
            throw new EmptyStackException();
        return items[size - 1];

    }

    //O(1)
    public boolean empty() {
        return size == 0;
    }

    //O(n)
    public int search(int item) {
        if (empty())
            return -1;
        for (int i = items.length-1; i >= 0; i--) {
            if (item == items[i])
                return items.length - i;
        }
        return -1;
    }


}
