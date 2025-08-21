package Conditionals;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st side : ");
        int s1 = sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int s2 = sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int s3 = sc.nextInt();

        if ((s1 + s2) > s3 && (s2 + s3) > s1 && (s3 + s1) > s2){
            System.out.println(s1 + ", " + s2 + " and " + s3 + " can form a triangle");
        }
        else System.out.println(s1 + ", " + s2 + " and " + s3 + " can't form a triangle");
    }
}