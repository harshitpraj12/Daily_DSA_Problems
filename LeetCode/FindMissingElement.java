package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElement {

    public static void main(String[] args) {
        int [] nums = {7, 8, 6, 9};
        List<Integer> ans = solve(nums);
        System.out.println(ans);
    }

    private static List<Integer> solve(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        System.out.println(min);
        System.out.println(max);
        int [] arr = new int [max-min+1];
        for(int i : nums){
            arr[i-min]++;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i]==0){
                ans.add(i+min);
            }
        }
        return ans;
    }
}
