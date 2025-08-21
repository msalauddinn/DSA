package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class MultiplyAndAdd {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
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

        System.out.print("Before Changed : ");
        printArray(arr);
        System.out.println();

        for (int i = 0; i < size; i++){
            if (i % 2 == 0)
                arr[i] += 10;
            else
                arr[i] *= 2;
        }

        System.out.print("After Changed : ");
        printArray(arr);
    }
}
