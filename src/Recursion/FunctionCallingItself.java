package Recursion;

public class FunctionCallingItself {

    public static void greet(int n) {
        if (n == 5) return; // base case
        System.out.println("Morning"); // work
        greet(n+1); // call
    }

    public static void main(String[] args) {
        greet(1);
    }
}
