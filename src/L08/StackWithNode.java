package L08;

import java.util.EmptyStackException;

public class StackWithNode<E> {

    private Node<E> head;
    private int size;

    public StackWithNode() {
        this.head = null;
        size = 0;
    }

    //O(1)
    public E push(E item) {
        if (head == null)
            head = new Node<>(item);

        head = new Node<>(item, head);
        size++;
        return item;
    }

    //O(1)
    public E pop() {
        if (empty())
            throw new EmptyStackException();
        E item = head.getValue();
        head = head.getNext();
        return item;
    }

    //O(1)
    public E peek() {
        if (empty())
            throw new EmptyStackException();
        return head.getValue();

    }

    //O(1)
    public boolean empty() {
        return size == 0;
    }

    //O(n)
    public int search(E item) {
        if (empty())
            return -1;

        Node<E> temp = head;
        int index = 1;
        while (temp != null) {
            if (item.equals(temp.getValue()))
                return index;
            index++;
            temp = temp.getNext();

        }
        return -1;
    }

}
