package Strings;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()){
            System.out.println("false");
            return;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0; i < a1.length; i++)
            if (a1[i] != a2[i]) {
                System.out.println("false");
                return;
            }

        System.out.println("true");
    }
}
