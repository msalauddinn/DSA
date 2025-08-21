package OneDimensionalArrays.Arrays;

import java.util.Scanner;

import static OneDimensionalArrays.Arrays.BuiltInArrayMethods.print;

public class RotateArray {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j){
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void rotateArray(int[] arr, int k){
        int size = arr.length;
        k = k % size;

        reverse(arr, 0, size-1-k);
        reverse(arr, size-k, size-1);
        reverse(arr, 0, size-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter how many times you want to rotate : ");
        int k = sc.nextInt();

        rotateArray(arr, k);
        System.out.print("Rotated Array : ");
        print(arr);
    }
}
