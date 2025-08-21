package OneDimensionalArrays.Arrays;

public class ArrayOfGivenSize {
    public static void main(String[] args) {
        int[] arr = new int[7]; // 0 to 6 index
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        char[] ch = new char[5];
        for (int i = 0; i < ch.length; i++){
            System.out.print(ch[i] + " ");
        }
    }
}
