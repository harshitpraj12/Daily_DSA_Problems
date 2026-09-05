package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class IntersecctionOfTwoArray {
    public static void main(String[] args) {
        int [] a = {4,9,5};
        int [] b = {9,4,9,8,4};
        int [] ans = solve(a, b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] a, int[] b) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int n : a){
            s1.add(n);
        }
        for(int n : b){
            if(s1.contains(n)){
                s2.add(n);
            }
        }
        int i = 0;
        int [] ans = new int[s2.size()];
        for(int n : s2){
            ans[i++]=n;
        }
        return ans;
    }
}
