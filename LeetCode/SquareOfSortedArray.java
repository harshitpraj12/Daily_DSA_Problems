package LeetCode;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        int [] ans = solve(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n-1;
        int idx = n-1;
        while (left<=right) {
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                int a = nums[right]*nums[right];
                ans[idx--]=a;
                right--;
            }else{
                int a = nums[left]*nums[left];
                ans[idx--]=a;
                left++;
            }
        }
        return ans;
    }
}
