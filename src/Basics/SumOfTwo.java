package Basics;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.print(firstNumber + " + " + secondNumber + " = " + sum);
    }
}
