package Strings;

public class StringToIntegerAndIntegerToString {
    public static void main(String[] args) {
        int n = 24666;

        String s = Integer.toString(n);
        System.out.println(s.length());
        System.out.println(s);

        String str = "463";
        int l = Integer.parseInt(str);
        System.out.println(l+1);

        String str2 = "432223132131331";
        long m = Long.parseLong(str2);
        System.out.println(m+1);
    }
}
