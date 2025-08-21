package BasicSortingAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        print(arr);
        insertionSort(arr);
        print(arr);
    }
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

    public static void insertionSort(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }
}
