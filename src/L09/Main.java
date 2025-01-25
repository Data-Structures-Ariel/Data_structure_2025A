package L09;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        MyLinkedList<Integer> mll = new MyLinkedList<>();
        for (int i = 0; i < 100; i++) {
            mll.add(i);
        }


        for (int i = 0; i < 100; i++) {
            System.out.println(mll.get(i));
        }
        Iterator<Integer> iMll = mll.iterator();
        while (iMll.hasNext())
            System.out.println(iMll.next());

        iMll = mll.iterator();

        String str;

        System.out.println("----------- Welcome !!! ----------------- ");
        while (!(str = new Scanner(System.in).next()).equals("exit")) {
            System.out.println("Enter");
            switch (str) {

                case "next":
                    if (iMll.hasNext())
                        System.out.println(iMll.next());
                    else
                        System.out.println("No next!!!");
                    break;
                case "rand":
                    System.out.println(new Random().nextInt());
                    break;
                default:
                    System.out.println("Invalid argument");
            }


        }
    }
}
