package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class MissingInArray {
    public static void methodOne(int[] arr){
        int size = arr.length;
        int n = size + 1;

        for (int i = 1; i <= n; i++){
            boolean flag = false;
            for (int ele : arr){
                if (i == ele){
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println(i);
        }
    }

    public static void methodTwo(int[] arr){
        int size = arr.length;

        boolean[] check = new boolean[size + 2];

        for (int ele : arr){
            check[ele] = true;
        }
        for (int i = 1; i < check.length; i++){
            if (!check[i]) System.out.println(i);
        }
    }

    public static void methodThree(int[] arr){
        int size = arr.length;
        long n = size + 1;

        long sum = 0;
        for (int ele : arr)
            sum += ele;

        long nSum = (n * (n + 1) / 2);

        System.out.println(nSum - sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        // methodOne(arr); --> Time Exceed
        // methodTwo(arr); --> In time limit but O(2n)
        methodThree(arr);
    }
}
