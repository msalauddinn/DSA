package Sorting.AdvanceAlgorithms;

import java.util.Scanner;

public class MergeTwoSortedArray {

    public static void print(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }

        while (j < b.length) c[k++] = b[j++];
        while (i < a.length) c[k++] = a[i++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size : ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.print("Enter 1st Array Elements : ");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Enter 2nd Array Size : ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.print("Enter 2nd Array Elements : ");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        int[] c = new int[n1 + n2];

        print(a);
        print(b);

        merge(a, b, c);

        print(c);
    }
}
