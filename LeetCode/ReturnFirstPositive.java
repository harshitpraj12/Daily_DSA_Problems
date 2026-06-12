package LeetCode;

import java.util.Arrays;

public class ReturnFirstPositive {
    public static void main(String[] args) {
        int [] arr = {3,4,-1,1};
        System.out.println(solve(arr));
    }

    private static int solve(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            while(1<=nums[i] && nums[i]<=n && nums[i]!=nums[nums[i]-1]){
                int idx = nums[i]-1;
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                System.out.println(Arrays.toString(nums));
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
