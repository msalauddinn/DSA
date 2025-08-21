package TwoDimensionalArrays.Arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row : ");
        int row = sc.nextInt();

        System.out.print("Enter column : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        ArrayList<Integer> ans = spirallyTraverse(arr);
        System.out.println("List is here");

        for (int ele : ans){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int fr = 0, lr = arr.length - 1, fc = 0, lc = arr[0].length - 1;

        while (fr <= lr && fc <= lc){

            for (int i = fc; i <= lc; i++){
                ans.add(arr[fr][i]);
            }
            fr++;

            if (fr > lr || fc > lc) break;

            for (int i = fr; i <= lr; i++){
                ans.add(arr[i][lc]);
            }
            lc--;

            if (fr > lr || fc > lc) break;

            for (int i = lc; i >= fc; i--){
                ans.add(arr[lr][i]);
            }
            lr--;

            if (fr > lr) break;

            for (int i = lr; i >= fr; i--){
                ans.add(arr[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}
