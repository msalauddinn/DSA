package Basics;

public class PrintingTextAndVariables {
    public static void main(String[] args) {
        int x = 10;
        /*
            System.out.print("My number is ");
            System.out.print(x);
            System.out.print(" and I love it");
         */

        System.out.println("My number is " + x + " and I love it");

        System.out.println("Hello" + 20 + 30);
        System.out.println("Hello" + (20 + 30));
        System.out.println(20 + 30 + "Hello");
    }
}
