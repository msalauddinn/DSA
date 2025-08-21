package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class MinInArray {
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int ele : arr){
            if (ele < min)
                min = ele;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Minimum in the given Array : " + findMin(arr));
    }
}
