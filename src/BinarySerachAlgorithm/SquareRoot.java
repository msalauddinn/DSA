package BinarySerachAlgorithm;

import java.util.Scanner;

public class SquareRoot {

    public static int sqrt(int num){
        int low = 1, high = num;

        while (low <= high){
            int mid = (low + high) / 2;
            int square = mid * mid;

            if (square == num) return mid;
            else if (square > num) high = mid - 1;
            else low = mid + 1;
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int sqrt = sqrt(num);

        System.out.println("Square root of " + num + " is " + sqrt);
    }
}
