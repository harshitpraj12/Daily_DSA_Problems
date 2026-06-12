package NeetCode;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 5, 4};
        if(solve(nums)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])) return false;
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        return true;
    }
}
