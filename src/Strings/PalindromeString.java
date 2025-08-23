package Strings;

import java.util.Scanner;

public class PalindromeString {

    public static boolean palindrome(String s){
        int n = s.length();
//        int k = 0;
//
//        for (int i = n-1; i >= 0; i--){
//            char ch = s.charAt(i);
//
//            if (ch != s.charAt(k)) {
//                return false;
//            }
//            k++;
//        }
//        return true;

        int i = 0, j = n-1;
        while (i <= j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (palindrome(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
