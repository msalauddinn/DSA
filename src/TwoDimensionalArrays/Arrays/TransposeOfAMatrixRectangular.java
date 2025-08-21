package TwoDimensionalArrays.Arrays;

import java.util.Scanner;

import static TwoDimensionalArrays.Arrays.TransposeOfAMatrix.print;

public class TransposeOfAMatrixRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter columns : ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.println("Enter Array elements");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();

        }

        int[][] arr2 = new int[col][rows];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < col; j++){
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("Transposed array");
        print(arr2);
    }
}
