package TwoDimensionalArrays.Arrays;

import java.util.Scanner;

import static TwoDimensionalArrays.Arrays.TransposeOfAMatrix.print;

public class RotateBy90 {
    public static void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void swap(int[][] arr, int i, int j, int k){
        int temp = arr[i][j];
        arr[i][j] = arr[i][k];
        arr[i][k] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        System.out.print("Enter column : ");
        int col = sc.nextInt();

        System.out.println("Enter Array elements");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < row; i++){
            for (int j = 0; j < i; j++){
                swap(arr, i, j);
            }
        }
        System.out.println("transpose");
        print(arr);

        for (int i = 0; i < row; i++){
            int j = 0, k = col - 1;
            while (j < k){
                swap(arr, i, j, k);
                j++;
                k--;
            }
        }

        System.out.println("rotate");
        print(arr);
    }
}
