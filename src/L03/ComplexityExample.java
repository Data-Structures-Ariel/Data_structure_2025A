package L03;

import java.util.Random;

public class ComplexityExample {

    public static void main(String[] args) {

        /* O(1)
        for (int i = 0; i < 80; i++) {
            System.out.println();
        }
        */

        /*
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        .
        .
        .
        System.out.println();
         */

        int n = new Random().nextInt();
        /* O(n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
         */


         /* O(n) 1/100000 * n +b
        for (int i = 0; i < n/100000; i++) {
            System.out.println(i);
        }
         */


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }
        }
        // n+n+n+n+...+n


        //O(n) an+b
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }
        }

        //O(n) an+b
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(j);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println(j);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }
        }


        for (int i = 0; i < n / n /*O(1)*/; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(j);
            }
        }

        for (int i = 0; i < n / n /*O(1)*/; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(j);
            }
        }

        //O(n) an+b
        int m = new Random().nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(j);
            }
        }
        // m+m+m+..+m


        int l = new Random().nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                System.out.println(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                for (int k = 0; k < l; k++) {
                    System.out.println(k);
                }
            }
        }

        /*
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < m/2; j++) {
                O(l)
            }
        }

           for (int i = 0; i < n; i++) {

               O(m/2) * O(l)

        }

            O(n) * O(m/2) * O(l)
            O(n*m*l)

         */


        for (int i = 1; i < n; i*=2) {
            System.out.println(i);
        }

        for (int i = n; i >1 ; i/=2) {
            System.out.println(i);
        }

        for (int i = n; i >1 ; i/=2) {
            System.out.println(i);
        }
        //
    }
}
