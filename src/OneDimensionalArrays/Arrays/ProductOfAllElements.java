package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class ProductOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int product = 1;

        for (int i = 0; i < size; i++){
            product *= arr[i];
        }
        System.out.println("Product is : " + product);
    }
}
