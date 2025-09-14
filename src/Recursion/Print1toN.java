package Recursion;

import java.util.Scanner;

public class Print1toN {

    // static int m;

//    public static void print(int n, int i) {
//        if (n>i) return;
//        System.out.println(n);
//        print(n + 1, i);
//    }

//    public static void print(int n) {
//        if (n>m) return;
//        System.out.println(n);
//        print(n + 1);
//    }

    public static void print(int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // m = sc.nextInt();

        System.out.print("n = ");
        int n = sc.nextInt();

        // print(1); // global variable
        // print(1, n); // 2 parameter
        print(n); // 1 parameter
    }
}
