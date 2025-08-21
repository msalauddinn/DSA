package OneDimensionalArrays.Arrays;

import java.util.Scanner;

import static OneDimensionalArrays.Arrays.BuiltInArrayMethods.print;

public class ReverseArray {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr){
        int i = 2;
        int j = 7;

        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
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

        reverse(arr);
        print(arr);
    }
}
