package Strings;

public class StringAsADataType {
    public static void main(String[] args) {
        String name = "Saksham is a good boy";
        System.out.println(name + " " + name.length());

        System.out.println(name.charAt(3)); // we can print a char of an array like this

        char[] n = {'s', 'a', 'k'}; // as a char array we can print
        System.out.println(n[2]); // this but
        // System.out.println(name[2]); // we can't do this with string

        String str = "Md Salauddin";
        // System.out.println(str);

        // we can print this string using array also
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }

    }
}
