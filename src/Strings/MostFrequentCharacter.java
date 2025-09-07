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

    public static char mostFrequentChar(String s){
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch-97]++;
        }

        int max = -1;
        char ans = s.charAt(0);
        for (int i = 0; i < freq.length; i++){
            if (freq[i] > max){
                max = freq[i];
                ans = (char) (i + 97);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(mostFrequentChar(s));
    }
}
