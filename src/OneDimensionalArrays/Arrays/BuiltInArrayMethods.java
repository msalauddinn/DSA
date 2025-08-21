package OneDimensionalArrays.Arrays;

import java.util.Arrays;

public class BuiltInArrayMethods {
    public static void print(int[] arr){
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 2, 6, 6, 8, 2, 2};
        // Arrays.sort(arr);
        print(arr);

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr, 2, 7); // sorts from 2 to 6
        print(arr);

        Arrays.fill(arr,10);
        print(arr);
    }
}
