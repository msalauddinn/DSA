package Sorting.BasicAlgorithms;

import java.util.Scanner;

public class SelectionSort {
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

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            // int min = Integer.MAX_VALUE;
            int minIdx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIdx]) {
                    // min = arr[j]
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);

//            boolean flag = true;
//            for (int j = i+1; j < n-1; j++){
//                if (arr[j] > arr[j - 1]) {
//                    // min = arr[j]
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) break;
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

        print(arr);
        selectionSort(arr);
        print(arr);
    }
}
