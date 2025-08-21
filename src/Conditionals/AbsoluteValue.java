package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int origNum = num;

        if (num < 0) {
            num = -(num);
            System.out.println("Absolute value of " + origNum + " is : " + num);
        }
        else System.out.println("Absolute value of " + origNum + " is : " + num);
    }
}
