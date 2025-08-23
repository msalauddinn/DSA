package Strings;

public class PlusOperator {
    public static void main(String[] args) {
        System.out.println("Md " + "Salauddin"); // doing concatenation
        System.out.println("Salauddin " + 10 + 20);
        // left to right string + string = string
        // string + int = string
        // string + anything = string
        System.out.println(10 + 20 + " Salauddin");
        // here 1st addition is between two int so here addition then int + string
        // gives string

        System.out.println("Salauddin" + (10 + 30));

        // we can't multiply, subtract and divide
        // System.out.println("Salauddin" * (10 + 30)); // Error
        // System.out.println("Salauddin" - (10 + 30)); // Error
        // System.out.println("Salauddin" / (10 + 30)); // Error
    }
}
