package TwoDimensionalArrays.Arrays;

public class TransposeOfAMatrix {

    public static void print(int[][] arr){
        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7}, {1,3,7,2}, {9,9,4,5}, {2,4,5,6}};

        System.out.println("Original Array");
        print(arr);

        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Transposed Array");
        print(arr);
    }
}
