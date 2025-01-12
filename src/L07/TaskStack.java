package L07;

import java.util.*;

public class TaskStack {

    public static void main(String[] args) {
        Integer[] s1Arr = {3,4,5,7,8,9,6,6,5,1,2,5};
        Integer[] S2Arr = {3,4,5,7,8,9,9,9,9};
        Stack<Integer> s1 = new Stack<>();
        s1.addAll(Arrays.asList(s1Arr));

        Stack<Integer> s2 = new Stack<>();
        s2.addAll(Arrays.asList(S2Arr));

        GenNumber(null);

        Stack<Integer> newSt = LongNumber(s1,s2 );
        System.out.println(newSt);
    }

    private static Stack<Integer> LongNumber(Stack<Integer> s1, Stack<Integer> s2) {

        if (s1 == null && s2 == null)
            return new Stack<>();

        if (s1 != null && s2 == null)
            return (Stack<Integer>) s1.clone();

        if (s1 == null && s2 != null)
            return (Stack<Integer>) s2.clone();


        Stack<Integer> temp = new Stack<>();
        Stack<Integer> newSt = new Stack<>();


        int sum;
        int c = 0;
        // s1 = 345,789,665,125
        // s2 =     345,789,999

        while (!s1.isEmpty() || !s2.isEmpty()) {

            sum = ((s1.isEmpty()) ? 0 : s1.pop()) + ((s2.isEmpty()) ? 0 : s2.pop()) + c;
            temp.push(sum % 10);
            c = sum / 10;

        }

        while (!temp.isEmpty())
            newSt.push(temp.pop());


        return newSt;

    }

    private static void GenNumber(Collection<? super Integer> collection) {
        if (collection == null)
            return;
        Random rd = new Random();
        int size = rd.nextInt(1, 15);

        collection.add(rd.nextInt(1, 10));
        for (int i = 0; i < size; i++) {
            collection.add(rd.nextInt(0, 10));
        }

    }
}
