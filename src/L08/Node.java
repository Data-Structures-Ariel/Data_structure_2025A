package L08;

public class Node<E> {

    private E value;
    private Node<E> next;


    public Node(E value,  Node<E> next) {
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
                "{value = " + value +" next } --> " + next ;
    }
}
