package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class GenerateParenthesis {

    public static void generate(String s, int left, int right, int n, ArrayList<String> ans) {
        // if (left == right) generate("(", left+1, right, n, ans);
        // else if (left == n/2) generate(")", left, right+1, n, ans);
        // else if (left > right) generate(")", left, right+1, n, ans);

        if (right == n/2) {
            ans.add(s);
            return;
        }

        if (left < n/2) generate(s+"(", left+1, right, n, ans);
        if (right < left) generate(s+")", left, right+1, n, ans);
    }

    public static ArrayList<String> generateParentheses(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate("", 0, 0, n, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(generateParentheses(n));
    }
}
