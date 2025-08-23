package Strings;

public class CompareToMethod {
    public static void main(String[] args) {
        String a = "Sakil";
        String b = "Sakhil";

        System.out.println(a.compareTo(b)); // if char is unequal then it gives char[a]-char[b]

        a = "Sakil";
        b = "Toumik";

        System.out.println(a.compareTo(b));

        a = "Sakil";
        b = "Sakil Sekh";

        System.out.println(a.compareTo(b)); // remaining character count will be printed
    }
}
