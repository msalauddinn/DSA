package Conditionals;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int num1, num2, num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        // using if-else ladder
        /*
            if (num1 >= num2 && num1 >= num3){
                System.out.println(num1 + " is greatest");
            }
            else if (num2 >= num3 && num2 >= num1){
                System.out.println(num2 + " is greatest");
            }
            else
                System.out.println(num3 + " is greatest");
         */

        // using nested if-else
        if (num1 >= num2){
            if (num1 >= num3)
                System.out.println(num1 + " is greatest");
            else
                System.out.println(num3 + " is greatest");
        }
        else {
            if (num2 >= num3)
                System.out.println(num2 + " is greatest");
            else
                System.out.println(num3 + " is greatest");
        }
    }
}
