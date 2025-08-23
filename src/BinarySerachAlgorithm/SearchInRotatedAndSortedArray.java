package BinarySerachAlgorithm;

import java.util.Scanner;

public class SearchInRotatedAndSortedArray {

    public static int search(int[] arr, int target){
        int n = arr.length;

        int low = 0, high = n-1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;
            if (arr[low] <= arr[mid]) { // low to mid is sorted
                if (arr[low] <= target && arr[mid] > target) high = mid - 1;
                else low = mid + 1;
            }
            else { // mid to high is sorted
                if (arr[high] >= target && arr[mid] < target) low = mid + 1;
                else high = mid - 1;
            }
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

        System.out.println("Found at : " + search(arr, target));
    }
}
