package Loops.ForLoops;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        /*
            for (int i = 2; i <= num; i += 2){
                System.out.print(i + " ");
            }
         */

        for (int i = 1; i <= num; i++){
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
