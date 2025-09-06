package Strings;

public class ComparingTwoStrings {
    public static void main(String[] args) {
        String s1 = "Toumik";
        String s2 = "Toumik";

        String s3 = new String("Toumik");

        System.out.println(s1 == s2); // It's showing correct
        System.out.println(s1 == s3); // false, mean this is incorrect return // to prevent this,
        // '==' always check if two strings have same address
        // try this
        System.out.println(s1.equals(s3)); // this will print correct
        // equals compare whole string letter to letter

        // s1.charAt(0) = "t"; // ERROR because string is immutable

        char s4 = 'b';
        int a = 2;
        System.out.println(s4 + a);
    }
}
