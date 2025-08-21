package Methods;

import java.util.Scanner;

public class ArgumentsAndParameters {
    public static void max(int a, int b, int c){ // parameters
        if (a >= b){
            if (a >= c)
                System.out.println(a + " is max");
            else
                System.out.println(c + " is max");
        }
        else {
            if (b >= c)
                System.out.println(b + " is max");
            else
                System.out.println(c + " is max");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        max(a, b, c); // arguments
    }
}
