package Recursion;

import java.util.Scanner;

public class PrintDecreasingIncreasing {

    public static void increasingDecreasing(int n) {
        System.out.print(n + " ");
        if (n == 1) return;
        increasingDecreasing(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        increasingDecreasing(n);
    }
}
