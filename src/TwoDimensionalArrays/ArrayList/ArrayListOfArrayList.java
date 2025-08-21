package TwoDimensionalArrays.ArrayList;

import java.util.ArrayList;

public class ArrayListOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(3); a.add(5); a.add(7);

        ArrayList<Integer> b = new ArrayList<>();

        b.add(2); b.add(4); b.add(6);

        ArrayList<Integer> c = new ArrayList<>();

        c.add(10); c.add(11); c.add(12); c.add(4);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        arr.add(a);
        arr.add(b);
        arr.add(c);

//        for (int i = 0; i < arr.size(); i++){
//            for (int j = 0; j < arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }

        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10); arr.get(arr.size()-1).add(20);

        for (ArrayList<Integer> list : arr){
            for (int ele : list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
