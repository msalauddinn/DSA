package Strings;

public class Substrings {
    public static void main(String[] args) {
        String str = "Salauddin"; //  index is [0, 8]

        System.out.println(str.substring(1)); // printing string after index 1 including itself
        System.out.println(str.substring(2, 6)); // in this [i, j) mean second parameter is excluded
        System.out.println(str.substring(2, 2)); // nothing return because the next to is excluded
    }
}
