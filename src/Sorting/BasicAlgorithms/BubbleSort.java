package Sorting.BasicAlgorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void print(int[] arr){
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sorting(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){

            // adjacent swapping

            // boolean flag = true; // assume array is sorted
            int swaps = 0;
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    // flag = false;
                    swaps++;
                    swap(arr, j, j+1);
                }
            }
            // if (flag) return;
            if (swaps == 0) return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Before sort : ");
        print(arr);

        sorting(arr);

        System.out.print("After sort : ");
        print(arr);
    }
}
