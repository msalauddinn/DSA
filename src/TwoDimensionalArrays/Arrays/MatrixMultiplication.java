package TwoDimensionalArrays.Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int row = sc.nextInt();

        int[][] mat1 = new int[row][row];
        int[][] mat2 = new int[row][row];

        System.out.println("Enter 1st matrix");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < row; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter 2nd matrix");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < row; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] mat3 = new int[row][row];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < row; j++){
                for (int k = 0; k < row; k++){
                    mat3[i][j] += (mat1[i][k] * mat2[k][j]);
                }
            }
        }

        System.out.println("Matrix Multiplication");
        for (int[] a : mat3){
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
