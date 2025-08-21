package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class PrintNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Negative Elements are : ");
        for (int i = 0; i < size; i++){
            if (arr[i] < 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
