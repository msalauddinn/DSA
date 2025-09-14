package Recursion;

import java.util.Scanner;

public class APowerB {

    public static int pow(int a, int b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        return a * pow(a, b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // a is always != 0
        int b = sc.nextInt();

        if (b < 0) {
            System.out.println("Power must positive");
            return;
        }

        System.out.println(a + " to the power " + b + " = " + pow(a, b));
    }
}
