package Methods;

import java.util.Scanner;

public class CalculateCombinationAndPermutation {
    public static double fact(int n) {
        double factorial = 1.0;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter r : ");
        int r = sc.nextInt();

        double ncr = fact(n) / (fact(r) * fact(n - r));
        double npr = fact(n) / fact(n - r);

        System.out.println("nCr is " + ncr);
        System.out.println("nPr is " + npr);
    }
}