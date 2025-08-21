package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < size; i++){
            /*
                if (arr[i] > max)
                max = arr[i];
             */
            max = Math.max(max, arr[i]);
        }
        System.out.println("Max of All Element : " + max);
    }
}
