package BinarySerachAlgorithm;

import java.util.Scanner;

public class BinarySearch {

    public static int search(int[] arr, int target){
        int n = arr.length;

        int low = 0, high = n-1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] > target) high = mid - 1;
            else if (arr[mid] < target) low = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter Target : ");
        int target = sc.nextInt();

        int idx = search(arr, target);

        if (idx == -1) System.out.println(target + " is not present in the array");
        else System.out.println(target + " is present at index " + idx);
    }
}
