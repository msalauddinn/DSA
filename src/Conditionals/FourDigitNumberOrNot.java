package Conditionals;

import java.util.Scanner;

public class FourDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num >= 1000 && num < 10000){
            System.out.println(num + " is a four digit number");
        }
        else System.out.println(num + " is not a four digit number");
    }
}
