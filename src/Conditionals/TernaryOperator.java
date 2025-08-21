package Conditionals;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int ans = (num >= 0) ? 100 : 99;
        System.out.println("Answer is : " + ans);
    }
}
