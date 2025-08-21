package OneDimensionalArrays.Arrays;

import java.util.Arrays;

import static OneDimensionalArrays.Arrays.MultiplyAndAdd.printArray;

public class ShallowCopyAndDeepCopy {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 7};
        System.out.print("Before change : ");
        printArray(a);
        System.out.println();

        int[] d = new int[a.length];
        for (int i = 0; i < a.length; i++){
            d[i] = a[i];
        }

        printArray(d);
        System.out.println();

        int[] c = Arrays.copyOf(a, a.length); // this is deep copy of a
        c[0] = 21; // it will not change a
        printArray(c);
        System.out.println();
        printArray(a);
        System.out.println();

        int[] b = a; // b is shallow copy of a
        printArray(b);
        System.out.println();

        b[0] = 19; // it'll change a
        printArray(b);
        System.out.println();

        printArray(a);


    }
}
