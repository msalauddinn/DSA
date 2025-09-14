package Strings;

import java.util.Scanner;

public class StringCompression {

    public static int lengthAfterUpdate(char[] chars){
        int n = chars.length;

        int i = 0, j = 0, write = 0;

        while (j < n){
            if (chars[i] == chars[j]) j++;
            else {
                chars[write++] = chars[i];
                int length = j - i;
                if (length > 1) {
                    String len = Integer.toString(length);
                    for (int k = 0; k < len.length(); k++){
                        chars[write++] = len.charAt(k);
                    }
                }
                i = j;
            }
        }
        chars[write++] = chars[i];
        int length = j - i;
        if (length > 1) {
            String len = Integer.toString(length);
            for (int k = 0; k < len.length(); k++){
                chars[write++] = len.charAt(k);
            }
        }
        return write;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size : ");
        int n = sc.nextInt();

        char[] chars = new char[n];
        System.out.print("Enter characters : ");
        for (int i = 0; i < n; i++) chars[i] = sc.next().charAt(0);

        int len = lengthAfterUpdate(chars);
        System.out.println(len);
    }
}
