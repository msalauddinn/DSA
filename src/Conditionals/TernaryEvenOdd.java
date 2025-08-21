package Conditionals;

import java.util.Scanner;

public class TernaryEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println((num % 2 == 0) ? "Even Number" : "Odd Number");

        // (num % 2 == 0) ? System.out.println("Even Number") : System.out.println("Odd Number"); // ERROR
    }
}
