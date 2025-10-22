package Recursion;

import java.util.Scanner;

public class StringSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        StringBuilder s = new StringBuilder(sc.nextLine());

        // String s = "abcd";
        // a b c d ab ac ad bc bd abc abd bcd cd abcd

        subsets(s, "", 0);
    }

    private static void subsets(StringBuilder s, String ans, int i) {
        if (i == s.length()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = s.charAt(i);
        subsets(s, ans, i+1); // skip
        subsets(s, ans+ch, i+1); // pick
    }
}
