package OneDimensionalArrays.Arrays;

public class PassByReference {
    public static void main(String[] args) {
        // int x = 5;
        int[] arr = {4, 6, 3, 7};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
    public static void change(int[] arr){
        arr[2] = 100;
    }
}
