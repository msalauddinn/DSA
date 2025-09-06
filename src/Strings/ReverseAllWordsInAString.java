package Strings;

import java.util.Scanner;

public class ReverseAllWordsInAString {

    public static void reverse(StringBuilder sb, int i, int j){
        while (i < j){
            char temp = sb.charAt(j);
            sb.setCharAt(j, sb.charAt(i));
            sb.setCharAt(i, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0, j = 0;
        while (j < sb.length()){
            char ch = sb.charAt(j);
            if (ch == ' '){
                reverse(sb, i, j-1);
                i = j + 1;
            }
            else if (j == sb.length()-1){
                reverse(sb, i, j);
                i = j+1;
            }
            j++;
        }

        System.out.println(sb);
    }
}
