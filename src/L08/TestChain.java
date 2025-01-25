package L08;

public class TestChain {


    public static void main(String[] args) {
        // chain address = 786ff
        Node<Integer> chain = new Node<Integer>(1);
        System.out.println(chain);

        Node<Integer> n = new Node<Integer>(2);
        chain.setNext(n);

        System.out.println(chain);

        n = new Node<Integer>(3);

        chain.getNext().setNext(n);


        chain.getNext().getNext().setNext(new Node<Integer>(4));


        System.out.println(chain);

        chain.getNext().getNext().getNext().setNext(new Node<Integer>(5));

        System.out.println(chain);
//        add(null,6);
        addToLast(chain, 6);
//
//
        System.out.println(chain);

        chain = addToFirst(chain, 7);

        System.out.println(chain);

        chain = addToLast(10,chain);

        System.out.println(chain);



        Node<Integer> head = addToFirst(null,1);
        System.out.println(head);

        head = addToFirst(head,2);

    }

    //O(1)
    private static Node<Integer> addToFirst(Node<Integer> chain, int value) {

        if (chain == null)
            return new Node<Integer>(value);

        Node<Integer> firstNode = new Node<Integer>(value);
        firstNode.setNext(chain);

        return firstNode;

    }


    //O(n)
    private static void addToLast(Node<Integer> chain, int value) {

        if (chain == null)
            return;

        while (chain.hasNext())
            chain = chain.getNext();


        chain.setNext(new Node<Integer>(value));

    }

    //O(n)
    private static Node<Integer> addToLast(int value, Node<Integer> chain) {

        if (chain == null)
            return new Node<Integer>(value);

        Node<Integer> temp = chain;

        while (temp.hasNext())
            temp = temp.getNext();


        temp.setNext(new Node<Integer>(value));

        return chain;

    }
}
