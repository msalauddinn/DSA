package TwoDimensionalArrays.Arrays;

import java.util.Scanner;

public class PrintColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Column Wise Print : ");
        for (int j = 0; j < arr[0].length; j++){
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
