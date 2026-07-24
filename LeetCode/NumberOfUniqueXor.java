package LeetCode;

import java.util.HashSet;

public class NumberOfUniqueXor {
    public static void main(String[] args) {
        int nums [] = {3, 4, 5, 6, 3};
        int ans = solve(nums);
        System.out.println(ans);
    }

    private static int solve(int[] nums) {
        HashSet<Integer> uSet = new HashSet<>();
        for(int n: nums){
            uSet.add(n);
        }
        int [] uarr = new int[uSet.size()];
        int idx = 0;
        for(int a : uSet){
            uarr[idx++]=a;
        }
        HashSet<Integer> uxor = new HashSet<>();
        int n = uarr.length;
        for(int i=0; i<n; i++){
            for(int j = i; j<n; j++){
                int a = uarr[i]^uarr[j];
                uxor.add(a);
            }
        }
        // uxor, uarr
        HashSet<Integer> ans = new HashSet<>();
        for(int c : uxor){
            for(int v : uarr){
                int a = c^v;
                ans.add(a);
            }
        }
        return ans.size();
    }
}
