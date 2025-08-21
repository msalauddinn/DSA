package TwoDimensionalArrays.Arrays;

import java.util.Scanner;

public class OutputIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];

        // int[][] arr = {{6,0,2,7,6}, {1,3,7,2,2}, {9,9,4,5,2}};

        System.out.println(arr.length + "  " + arr[0].length);

        // Input
        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
