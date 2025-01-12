package L06;

import java.util.Random;
import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> stc = new Stack<>() ;/*{{
            Random rd = new Random();
            for (int i = 0; i < 10; i++) {
                push(rd.nextInt(i));
            }
        }};*/

        A(5);

    }

    private static void A(int i) {
        if (i == 0)
            return;
        A(i - 1);

    }
}
