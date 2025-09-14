package Recursion;

import java.util.Scanner;

public class FactorialOfANumber {

    public static long factorial(long n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        if (factorial(n) > 0) System.out.println("Factorial : " + factorial(n));
        else System.out.println("Invalid Input");
    }
}
