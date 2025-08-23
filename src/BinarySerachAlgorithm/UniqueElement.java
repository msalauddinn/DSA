package BinarySerachAlgorithm;

import java.util.Scanner;

public class UniqueElement {

    public static int uniqueElement(int[] arr){
        int n = arr.length;

        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n-1] != arr[n-2]) return arr[n-1];

        int low = 0, high = n-1;

        while (low <= high){
            int mid = (low + high) / 2;
            int f = mid, s = mid;

            if (arr[mid] == arr[mid-1]) f = mid - 1;
            else if (arr[mid] == arr[mid+1]) s = mid + 1;
            else return arr[mid];

            if ((f-low) % 2 == 0) low = s + 1;
            else high = f - 1;
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


        System.out.println("Unique Element is : " + uniqueElement(arr));
    }
}
