package Strings;

import java.util.Scanner;

public class DigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        String s = "";
        s += n;

        System.out.println(s.length());
    }
}