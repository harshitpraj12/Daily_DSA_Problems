package GFG;

import java.util.ArrayList;

public class SuffixSum {
    public static void main(String[] args) {
        int [] arr = {10, 14 ,16, 20};
        ArrayList<Integer> ans = solve(arr);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length - 1;
        int k = 0;
        for(int i = n; i>=0; i--){
            arr[i]+=k;
            k = arr[i];
        }
        for(int i =0; i<=n; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}