package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        int size = arr.length;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        if (secondMax != Integer.MIN_VALUE) return secondMax;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int secondMax = secondLargest(arr);
        System.out.println(secondMax);
    }
}
