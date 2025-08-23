package Strings;

import java.util.Scanner;

public class NoOfVowelConsonantAndAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        checkString(s);
    }

    public static void checkString(String s) {
        int alphabets = 0;
        int v = 0;
        int c = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if ((ch >= 65 && ch <= 90) || ch >= 97 && ch <= 122){
                alphabets++;
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    v++;
                }
                else c++;
            }
        }

        System.out.println("Alphabets : " + alphabets + "\n" +
                           "Vowel : " + v + "\n" +
                           "Consonant : " + c);
    }
}
