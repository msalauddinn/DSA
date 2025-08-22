package BinarySerachAlgorithm;

import java.util.Scanner;

public class FloorInSortedArray {

    public static int floorIndex(int[] arr, int x){
        int n = arr.length;

        int low = 0, high = n-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] <= x) low = mid + 1;
            else high = mid - 1;
        }
        return (low > 0) ? low - 1 : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        int idx = floorIndex(arr, x);

        if (idx == -1){
            System.out.println("No floor exist");
        }
        else System.out.println(idx);
    }
}
