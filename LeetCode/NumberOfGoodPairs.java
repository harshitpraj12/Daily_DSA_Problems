package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(solve(nums));
    }

    private static <K> int solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int ans = 0;
        for(int val : map.values()){
            if(val>1){
                ans+=(val*(val-1))/2;
            }
        }
        return ans;
    }
}
