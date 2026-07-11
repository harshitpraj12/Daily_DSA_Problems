package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int [] a = {4, 9, 5};
        int [] b = {9, 4, 9, 8, 4};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] a, int[] b) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int n : a){
            set1.add(n);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int n : b){
            if(set1.contains(n)){
                set2.add(n);
            }
        }
        int [] ans = new int[set2.size()];
        int i=0;
        for(int n: set2){
            ans[i++]=n;
        }
        return ans;
    }
}
