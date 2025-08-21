package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }
        System.out.println("Sum of all elements : " + sum);
    }
}
