package GFG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 1, 2};
        int [] b = {3, 2, 2, 3, 3, 2};

        ArrayList<Integer> arr = findUnion(a, b);
        System.out.println("Array is : "+ arr);

        System.out.println(new ArrayList<>());
    }

    private static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            set.add(b[i]);
        }
        return new ArrayList<>(set);
    }
}
