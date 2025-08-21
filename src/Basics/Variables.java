package Basics;

public class Variables {

    static int globalVariable;

    public static void main(String[] args) {
        System.out.println("Hello Md");

        int x; // declaration of variable
        x = 4; // initialization

        System.out.println(x);
        System.out.println(x + 7);

        int y = 9; // declaration and initialization in one line
        System.out.println(y);
        System.out.println(y - x);

        int a = 5, b = -15;
        System.out.println(a + b);

        int c, d;
        // c = 3, d = 12; --> ERROR
        c = 3;
        d = 12;

        System.out.println(c - d);

        int z;
        // System.out.println(z); // ERROR

        System.out.println(globalVariable);
    }
}
