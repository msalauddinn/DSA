package Strings;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        // String name = sc.next(); // we can input before a space from this
        String name = sc.nextLine(); // this can get whole sentence

        System.out.println(name);
        System.out.println();
        System.out.println("Another Method");
        System.out.println();

        for (int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i));
        }
    }
}
