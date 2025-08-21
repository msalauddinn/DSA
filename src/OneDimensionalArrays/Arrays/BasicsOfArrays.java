package OneDimensionalArrays.Arrays;

import java.util.Scanner;

public class BasicsOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {8, 3, 5, 7, 25, -3, 16};

        System.out.println(arr.length);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);

        // System.out.println(arr[-1]); ERROR out of bounce
        // System.out.println(arr[7]); ERROR out of bounce

        arr[3] = 12;
        System.out.print("After change : ");
        System.out.println(arr[3]);

        arr[5] = sc.nextInt();
        System.out.println(arr[5] + 3);
    }
}
