package OneDimensionalArrays.Arrays;
// input 1 2 3 4 5
// output : 2 1 4 3 5

import java.util.Scanner;

public class WaveInArray {

    public static void waveArray(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size - 1; i += 2){
            if (arr[i+1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        waveArray(arr);

        System.out.print("Wave Array : ");
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();
    }
}
