package Basics;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 6;
        x += 7; // x = x + 7

        System.out.println(x); // 13

        x -= 3; // x = x - 3
        System.out.println(x); // 10

        x *= 4; // x = x * 4
        System.out.println(x); // 40

        x /= 5; // x = x / 5
        System.out.println(x); // 8

        x %= 3; // x = x % 3
        System.out.println(x); // 2

        x++;
        System.out.println(x); // 3

        ++x;
        System.out.println(x); // 4

        --x;
        System.out.println(x); // 3

        x--;
        System.out.println(x); // 2

        System.out.println(x++); // 2
        System.out.println(x); // 3

        System.out.println(++x); // 4
        System.out.println(x); // 4

        System.out.println("Decrement ");

        x = 10;
        System.out.println(--x); // 9
        System.out.println(x--); // 9
        System.out.println(x); // 8
    }
}
