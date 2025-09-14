package Strings;

import java.util.Scanner;

public class ValidStringCompression {

    public static String isValidCompressed(String S){
        int n = S.length();

        StringBuilder sb = new StringBuilder(S);
        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;
        char ch = sb.charAt(i);

        while (j < n) {
            ch = sb.charAt(i);
            if (sb.charAt(j) == ch || sb.charAt(j) == (char) (ch - 32) || sb.charAt(j) == (char) (ch + 32)) j++;
            else {
                int length = j - i;
                String len = Integer.toString(length);
                ans.append(len);
                if (ch >= 65 && ch <= 90) ans.append((char) (ch+32));
                else ans.append(ch);
                i = j;
            }
        }
        int length = j - i;
        String len = Integer.toString(length);
        ans.append(len);
        if (ch >= 65 && ch <= 90) ans.append((char) (ch+32));
        else ans.append(ch);

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        System.out.println(isValidCompressed(S));
    }
}
