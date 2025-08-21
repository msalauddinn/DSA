package Basics;

import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pi, radius;
        pi = 3.1415;

        System.out.print("Enter radius : ");
        radius = sc.nextDouble();

        double area = pi * radius * radius;
        System.out.println("Area is = " + area);
    }
}
