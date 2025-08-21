package BasicSortingAlgorithm;

import java.util.Scanner;

public class isSortedOrNot {

    public static boolean isSortedAscending(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

    public static boolean isSortedDescending(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] < arr[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        if (isSortedAscending(arr) || isSortedDescending(arr)) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");
    }
}
