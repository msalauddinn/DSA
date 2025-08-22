package BinarySerachAlgorithm;

import java.util.Scanner;

public class PeakOfMountainArray {

    public static int peakElementIndex(int[] arr){
        int low = 1, high = arr.length - 2;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) low = mid + 1;
            else if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) high = mid - 1;
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

        int idx = peakElementIndex(arr);

        System.out.println("Peak element is : " + idx);
    }
}
