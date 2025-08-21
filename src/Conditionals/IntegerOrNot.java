package Conditionals;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        double num = sc.nextDouble();

        double fractionPart = num - (int)num;
        if (fractionPart == 0){
            System.out.println((int)num + " is an integer number");
        }
        else System.out.println(num + " is not an integer number");
    }
}
