package Strings;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        StringBuilder s = new StringBuilder(sc.nextLine());

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                int c = s.charAt(i) + 32;
                s.setCharAt(i, (char)c);
            }
            else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                int c = s.charAt(i) - 32;
                s.setCharAt(i, (char)c);
            }
        }
        System.out.println(s);
    }
}
