package L03;

import java.util.Arrays;
import java.util.Random;

public class Search {

    static Random rd = new Random();

    public static void main(String[] args) {

        int[] arr = generateArr(1000000000);

        int num = rd.nextInt(110);

        System.out.println("num ->" +num);

        boolean bool;
        int index;
        long start = System.currentTimeMillis();
        index = LinearSearch(arr, num);
        long end = System.currentTimeMillis();
        System.out.println("Time to linear search before sorting ->  "+ (end-start));

        Arrays.sort(arr);

        start = System.currentTimeMillis();
        index = LinearSearch(arr, num);
        end = System.currentTimeMillis();
        System.out.println("Time to linear search after sorting ->  "+ (end-start));

        start = System.currentTimeMillis();
        bool = binarySearchIter(arr, num);
        end = System.currentTimeMillis();
        System.out.println("Time to iteration binary search->  "+ (end-start));

        start = System.currentTimeMillis();
        bool = binarySearchRec(arr, num);
        end = System.currentTimeMillis();
        System.out.println("Time to recursive binary search ->  "+ (end-start));

        start = System.currentTimeMillis();
        bool = binarySearchWithCopyArray(arr,num);
        end = System.currentTimeMillis();
        System.out.println("Time to recursive binary search with copy array ->  "+ (end-start));

    }
    //O(logn)
    private static boolean binarySearchWithCopyArray(int[] arr, int num) {
        int s=0,e=arr.length-1;
        if (s >= e)
            return false;
        int mid = (e + s) / 2;
        if (arr[mid] == num)
            return true;
        if (arr[mid] > num)
            return binarySearchWithCopyArray(Arrays.copyOfRange(arr,s,mid), num);

        return binarySearchWithCopyArray(Arrays.copyOfRange(arr,mid+1,e), num);

    }

    //O(n)
    private static int[] generateArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = rd.nextInt(80);
        return arr;
    }

    //O(n)
    private static int LinearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    //O(logn)
    public static boolean binarySearchRec(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    //O(logn)
    private static boolean binarySearchRec(int[] arr, int num, int s, int e) {
        if (s > e)
            return false;
        int mid = (e + s) / 2;
        if (arr[mid] == num)
            return true;
        if (arr[mid] > num)
            return binarySearchRec(arr, num, s, mid - 1);

        return binarySearchRec(arr, num, mid + 1, e);
    }

    //O(logn)
    private static boolean binarySearchIter(int[] arr, int num) {

        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = (e + s) / 2;

            if (arr[mid] == num)
                return true;

            if (arr[mid] > num)
                e = mid - 1;

            if (arr[mid] < num)
                s = mid + 1;
        }

        return false;
    }
}
