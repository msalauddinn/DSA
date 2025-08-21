package OneDimensionalArrays.ArrayList;

import java.util.ArrayList;

public class ArrayListsInJava {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(14); // here capacity is 14
        ArrayList<Integer> arr = new ArrayList<>(); // capacity by default 10

        System.out.println(arr.size());

        arr.add(10); // add element
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.size());

        System.out.println(arr); // internally using loop

        for (int i = 0; i < arr.size(); i++){
            // System.out.println(arr[i]); // ERROR
            System.out.print(arr.get(i) + " "); // print element
        }
        System.out.println();

        arr.add(70);
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        arr.set(1, 200); // change element
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        arr.remove(3);
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }
}
