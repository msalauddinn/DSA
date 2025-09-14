package Strings;

import java.util.Scanner;

public class NonRepeatingCharacter {

    public static char nonRepeating(String s){
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 97]++;
        }

        char ans = '$';
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (freq[ch - 97] == 1) {
                return ch;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();

        System.out.println(nonRepeating(s));
    }
}
