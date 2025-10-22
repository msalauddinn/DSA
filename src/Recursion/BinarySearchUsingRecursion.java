package Recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

    public static int binary(int lo, int hi, int[] arr, int target){
        if (lo > hi) return -1;

        int mid = (lo+hi)/2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) return binary(mid+1, hi, arr, target);
        else return binary(lo, mid-1, arr, target);
    }

    public static int search(int[] arr, int target) {
        // int n = arr.length;
        // int low = 0, high = n-1;

        // while(low <= high){

        //     int mid = (low + high) / 2;

        //     if(arr[mid] < target) low = mid + 1;
        //     else if(arr[mid] > target) high = mid - 1;
        //     else return mid;
        // }
        // return -1;

        // using recursion

        return binary(0, arr.length-1, arr, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target : ");
        int target = sc.nextInt();

        System.out.println(search(arr, target));
    }
}
