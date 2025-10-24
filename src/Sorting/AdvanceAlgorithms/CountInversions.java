package Sorting.AdvanceAlgorithms;

import java.util.Scanner;

public class CountInversions {

    static int count;
    static int inversionCount(int[] arr) {
        count = 0;
        mergeSort(arr);
        return count;
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;

        if(n == 1) return; // base case

        int[] a = new int[n/2];
        int[] b = new int[n - n/2];

        for (int i = 0; i < n; i++) {
            if (i < n/2) a[i] = arr[i];
            else b[i-n/2] = arr[i];
        }

        mergeSort(a);
        mergeSort(b);
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k++] = a[i++];
            }
            else {
                count += a.length - i;
                arr[k++] = b[j++];
            }
        }

        while (j < b.length) arr[k++] = b[j++];
        while (i < a.length) arr[k++] = a[i++];
    }

                        // BRUTE FORCE METHOD

//    public static int countInversions(int[] arr) {
//        int n = arr.length;
//
//        int count = 0;
//        for (int i = 0; i < n; i++) for (int j = i+1; j < n; j++) if (arr[i] > arr[j]) count++;
//        return count;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(inversionCount(arr));
        sc.close();
    }
}
