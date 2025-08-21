package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("You typed : ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Negatives : ");
        for (int i = 0; i < size; i++){
            System.out.print(-arr[i] + " ");
        }

        System.out.println();
        System.out.print("Squares : ");
        for (int i = 0; i < size; i++){
            System.out.print((arr[i] * arr[i]) + " ");
        }
    }
}
