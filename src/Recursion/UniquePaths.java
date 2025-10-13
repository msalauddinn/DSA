package Recursion;

import java.util.Scanner;

public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        if (m == 1) return 1;
        if (n == 1) return 1;
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int m = sc.nextInt();

        System.out.print("Enter columns : ");
        int n = sc.nextInt();

        System.out.println(uniquePaths(m, n));
    }
}
