package Basics;

public class CharDataType {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);

        // char y = 'hello'; // ERROR

        int ascii = ch; // implicit typecasting // jor kore store korano
        System.out.println(ascii);

        char x = '!';
        int asc = (int)x; // explicit typecasting
        System.out.println(asc);

        char ch2 = 'b';
        System.out.println(ch2);
        System.out.println((int)ch2);
        System.out.println(ch2 + 0); // char + int --> int

        System.out.println(ch + ch2); // char + char --> int
    }
}
