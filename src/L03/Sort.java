package L03;

import java.util.Random;

public class Sort {

    static Random rd = new Random();

    public static void main(String[] args) {

        int[] arr = generateArr();
        insertionSort(arr);
        arr = generateArr();
        SelectionSort(arr);
        arr = generateArr();
        BubbleSort(arr);

    }

    private static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        
    }

    private static void SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[small]>arr[j])
                    small=j;
            }
            int temp = arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }

    }

    private static void insertionSort(int[] arr) {


    }

    private static int[] generateArr() {

        int[] arr = new int[rd.nextInt(50)];
        for (int i = 0; i < arr.length; i++)
            arr[i] = rd.nextInt(80);
        return arr;
    }
}
