package Sorting.BasicAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class twoSumSorted {

    public static boolean twoSum (int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0, j = n-1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if (sum == target) return true;
            else if (sum > target) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        if (twoSum(arr, target)) System.out.println("Pair Exist");
        else System.out.println("Pair does not Exist");
    }
}
