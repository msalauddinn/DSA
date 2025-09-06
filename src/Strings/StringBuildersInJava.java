package Strings;

import java.util.Scanner;

public class StringBuildersInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder("Naruto");
        // char ch = sc.next().charAt(0); // this is how we get input of character
        // System.out.println(ch);

        System.out.println(s);
        System.out.println(s.length());
        s.reverse(); // this change will affect the original
        System.out.println(s.charAt(2));
        System.out.println(s);
        s.setCharAt(0, 'n');
        System.out.println(s);

        // Input in StringBuilder
        System.out.print("Enter a name : ");
        StringBuilder s1 = new StringBuilder(sc.nextLine());
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);

        String str = s1.toString(); // StringBuilder to String
        System.out.println(str);
        // StringBuilder s3 = new StringBuilder(str); // String to StringBuilder
    }
}
