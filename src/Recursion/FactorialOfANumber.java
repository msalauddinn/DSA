package Recursion;

import java.util.Scanner;

public class FactorialOfANumber {

    public static long factorial(long n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        System.out.println("Factorial : " + factorial(n));
    }
}
