package OneDimensionalArrays.Arrays;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b; // a = 20
        b = temp; // b = 10

        System.out.println(a + " " + b);

        a = 30;
        b = 40;

        a = a + b; // a = 70
        b = a - b; // b = 30
        a = a - b; // a = 40

        System.out.println(a + " " + b);
    }
}
