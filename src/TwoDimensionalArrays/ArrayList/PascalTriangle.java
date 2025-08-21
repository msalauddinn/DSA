package TwoDimensionalArrays.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static List<List<Integer>> pascalTriangle1(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i) ans.get(i).add(1);
                else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> pascalTriangle2(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i) ans.get(i).add(1);
                else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> pascalTriangle3(int n){
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++){
                ans.get(i).add(1);
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i) ans.get(i).set(j, 1);
                else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    ans.get(i).set(j, val);
                }
            }
        }
        return ans;
    }

    public static ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i) ans.get(i).add(1);
                else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    ans.get(i).add(val);
                }
            }
        }
        return ans.get(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int n = sc.nextInt();

//        List<List<Integer>> ans = pascalTriangle3(n);
//
//        for (List<Integer> a : ans){
//            for (int ele : a){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }

        ArrayList<Integer> ans = nthRowOfPascalTriangle(n);
        for (int ele : ans) System.out.print(ele + " ");
        System.out.println();
    }
}
