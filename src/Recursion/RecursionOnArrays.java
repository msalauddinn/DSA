package Recursion;

public class RecursionOnArrays {

    public static int min(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return Math.min(arr[i], min(arr, i+1));
    }

    public static int max(int[] arr, int i) {
        if (i == arr.length-1) return arr[i];
        return Math.max(arr[i], max(arr, i+1));
    }

    public static void print(int[] arr, int i) {
        if (i == arr.length) return;
        print(arr, i+1);
        System.out.print(arr[i] + " ");
    }

    public static int sum(int[] arr, int i) {
        if (i == arr.length - 1) return arr[i];
        return arr[i] + sum(arr, i+1);
    }

    public static long product(int[] arr, int i) {
        if (i == arr.length-1) return arr[i];
        return arr[i] * product(arr, i+1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 14, 420, 5, 21, 11, 63};
        // print(arr, arr.length-1);
        print(arr, 0);
        System.out.println("\n" + sum(arr, 0));
        System.out.println("\nMax is " + max(arr, 0));
        System.out.println("\nProduct is " + product(arr, 0));
        System.out.println("\nMin is " + min(arr, 0));
    }
}
