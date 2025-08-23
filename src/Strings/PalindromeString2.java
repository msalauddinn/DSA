package Strings;

import java.util.Scanner;

public class PalindromeString2 {

    public static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;

        while (i < j){
            char ch = str.charAt(i);
            char c = str.charAt(j);
            if (((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) && ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))){

                if (ch <= 90) ch = (char) (ch + 32);
                if (c <= 90) ch = (char) (c + 32);

                if (ch != c) return false;
                i++;
                j--;
            }
            else if (!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))) i++;
            else j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (isPalindrome(str)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
