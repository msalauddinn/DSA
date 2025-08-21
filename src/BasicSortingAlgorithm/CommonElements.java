package BasicSortingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st array size : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter 1st array elements : ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter 2nd array size : ");
        int m = sc.nextInt();
        int[] b = new int[m];
        System.out.print("Enter 2nd array elements : ");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        ArrayList<Integer> ans = commonElements(a, b);

        System.out.print("Common elements are : ");
        for (int ele : ans)
            System.out.print(ele + " ");
        System.out.println();
    }
    public static ArrayList<Integer> commonElements(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;
        while (i < n && j < m){
            if (a[i] < b[j]) i++;
            else if (a[i] > b[i]) j++;
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
