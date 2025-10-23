package Recursion;

import java.util.Scanner;

public class LookAndSay {

    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n-1) + '#';
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) j++;
            else {
                int len = j - i;
                ans.append(len);
                ans.append(s.charAt(i));
                i = j;
            }
        }
//        int len = j - i;
//        ans.append(len);
//        ans.append(s.charAt(i));

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(countAndSay(n));
    }
}
