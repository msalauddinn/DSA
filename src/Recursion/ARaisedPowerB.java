package Recursion;

import java.util.Scanner;

public class ARaisedPowerB {

    public static int power(int a, int b) throws Exception {
        if (a == 0 && b == 0) throw new Exception("Indeterminate form");
        if (a == 1 || a == 0) return 1;
        if (b == 0) return 1;
        if (b == 1) return a;
        int pow = power(a, b/2);
        if (b % 2 == 0) return pow * pow;
        else return pow * pow * a;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base : ");
        int a = sc.nextInt();

        System.out.print("Enter Exponent : ");
        int b = sc.nextInt();

        if (b < 0) {
            System.out.println("Exponent must positive");
            return;
        }

        System.out.println(a + " raised to the power " + b + " = " + power(a, b));
    }
}
