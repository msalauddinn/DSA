package Strings;

public class BuiltInStringMethods {
    public static void main(String[] args) {
        String name = "Md Salauddin";
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));

        System.out.println(name.toUpperCase()); // it's create a new string so it can't affect in original string
        System.out.println(name);
        System.out.println(name.toLowerCase());
        System.out.println(name);

        // System.out.println(name.startsWith("md"));
        // System.out.println(name.contains("ala"));
    }
}
