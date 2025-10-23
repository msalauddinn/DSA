package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {

//    public static int towerOfHanoi(int n) {
//        if (n == 1) return 1;
//        return (2 * towerOfHanoi(n-1)) + 1;
//    }

    public static int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 0) return 0;
        int moves1 = towerOfHanoi(n-1, from, aux, to);
        int moves2 = towerOfHanoi(n-1, aux, to, from);
        return moves1 + moves2 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.println(towerOfHanoi(n, 1, 3, 2));
    }
}
