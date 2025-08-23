package BinarySerachAlgorithm;

import java.util.Scanner;

public class SearchIn2DSortedArray {

    public static boolean search(int[][] arr, int x){
        int row = arr.length;
        int col = arr[0].length;

//        int n = row * col;
//
//        int low = 0, high = n-1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            int midRow = mid / col;
//            int midCol = mid % col;
//
//            if (arr[midRow][midCol] == x) return true;
//            else if (arr[midRow][midCol] > x) high = mid - 1;
//            else low = mid + 1;
//        }
//        return false;

        //  column wise binary

        int low = 0, high = row - 1;
        int ansRow = 0;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid][col-1] == x){
                ansRow = mid;
                break;
            }
            else if (arr[mid][col-1] < x) low = mid + 1;

            else {
                ansRow = mid;
                high = mid - 1;
            }
        }

        // row wise binary from 0 to col - 1

        low = 0; high = col - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[ansRow][mid] == x) return true;
            else if (arr[ansRow][mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row : ");
        int row = sc.nextInt();

        System.out.print("Enter Col : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target : ");
        int x = sc.nextInt();

        if (search(arr, x)) System.out.println(x + " is present in the array");
        else System.out.println(x + " is not present in the array");
    }
}
