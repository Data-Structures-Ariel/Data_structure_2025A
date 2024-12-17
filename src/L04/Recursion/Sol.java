package L04.Recursion;

public class Sol {

    public static void main(String[] args) {
        int n = 6;
        int f = fact(n);
    }

    private static int fact(int n) {
        if (n == 0)
            return 1;
        return fact(n - 1) * n;
    }

    private static int sumN(int n) {
        if (n == 0)
            return 0;
        return sumN(n - 1) + n;
    }

    private static int pow(int base, int exp) {
        if (exp == 0)
            return 1;

        return pow(base, exp - 1) * base;
    }

    public static boolean contains(int[] arr, int item){

        return contains(arr,item,0);
    }

    private static boolean contains(int[] arr, int item, int index) {
        if(index==arr.length)
            return false;

        if(arr[index]==item)
            return true;

        return contains(arr,item,index+1);
    }
}
