package TwoDimensionalArrays.Arrays;

import java.util.Scanner;

public class RowWithMaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int row = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                row = i;
            }
        }
        System.out.println("Max Sum : " + maxSum + " in row : " + row);
    }
}
