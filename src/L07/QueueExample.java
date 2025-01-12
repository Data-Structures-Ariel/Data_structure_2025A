package L07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample {


    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        if(q instanceof LinkedList<Integer>)
            ((LinkedList<Integer>) q).get(5);


    }
}
