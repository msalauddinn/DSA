package Loops.ForLoops;

import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++)
            System.out.println("Hello World");
    }
}
