package Recursion;

import java.util.Scanner;

public class WaysToNthStair {

    public static int countWays(int n) {
        if (n >= 2) return n;
        return countWays(n-1) + countWays(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n-th stair : ");
        int n = sc.nextInt();

        System.out.println("Ways to reach " + n + " is : " + countWays(n));
    }
}
