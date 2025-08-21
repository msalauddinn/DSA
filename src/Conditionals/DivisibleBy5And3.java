package Conditionals;

import java.util.Scanner;

public class DivisibleBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num % 15 == 0)
            System.out.println("Aditya");
        else if (num % 5 == 0 || num % 3 == 0){
            if (num % 5 == 0)
                System.out.println("Tania");
            else
                System.out.println("Arjun");
        }
        else
            System.out.println("Eva");
    }
}
