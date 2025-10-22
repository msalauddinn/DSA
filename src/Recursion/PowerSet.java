package Recursion;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {

    private static void subsets(StringBuilder s, String ans, int i, List<String> arr) {
        if (i == s.length()) {
            if (!ans.isEmpty()) arr.add(ans);
            return;
        }

        char ch = s.charAt(i);
        subsets(s, ans, i+1, arr); // skip
        subsets(s, ans+ch, i+1, arr); // pick
    }

    public static List<String> AllPossibleStrings(String s) {

        List<String> arr = new ArrayList<>();
        subsets(new StringBuilder(s), "", 0, arr);
        Collections.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = sc.nextLine();

        System.out.println(AllPossibleStrings(s));
    }
}
