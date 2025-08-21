package Basics;

public class ModifyingVariableValues {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        // int x = 10; // ERROR
        x = 10;
        System.out.println(x);

        x = x + 7;
        System.out.println(x);

        x = x - 2;
        System.out.println(x);
    }
}
