package LeetCode;

import java.util.Arrays;

public class PairWithLessThanKDifference {
    public static void main(String[] args) {
        int [] nums = {2, 3, 4};
        int k = 5;
        int ans = solve(nums, k);
        System.out.println(ans);
    }

    private static int solve(int[] arr, int k) {
        Arrays.sort(arr);
        int count =0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[j]-arr[i]<k) count++;
        //     }
        // }
        int left = 0;
        for(int r = 0; r<arr.length; r++){
            while(arr[r]-arr[left]>=k){
                left++;
            }
            count+=(r-left);
        }
        return count;
    }
}
