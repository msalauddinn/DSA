package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static char mostFrequent(String s){
        char[] a = s.toCharArray();

        int maxCount = 0;
        char ans = '1';
        for (int i = 0; i < a.length; i++){
            int count = 1;
            for (int j = i+1; j < a.length; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (count >= maxCount) {
                ans = a[i];
                maxCount = count;
            }
        }
        return ans;
    }

    public static char mostFrequents(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);

        int i = 0, j = 0, maxLen = 0;
        char ans = ' ';

        while (j < a.length) {
            if (a[i] == a[j]) j++;
            else {
                int len = j - i;
                if (len > maxLen) {
                    maxLen = len;
                    ans = a[i];
                }
                i = j;
            }
        }
        int len = j - i;
        if (len > maxLen) {
            ans = a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(mostFrequents(s));
    }
}
