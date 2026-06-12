package GFG;

import java.util.HashMap;

public class MinimunDistance {
    public static void main(String[] args) {
        // int [] nums = {1,1,2,3,2,1,2};
        int [] nums = {1,2,1,1,3};
        int ans = solve(nums);
        System.out.println("Answer is "+ans);
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num: nums){
        //     map.put(map.getOrDefault(num, 0)+1, num);
        // }
        // int key = map.get(3);
        // int ans [] = new int[3];
        // int idx = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==key) ans[idx++] = i;
        // }
    }

    private static int solve(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(map.getOrDefault(num, 0)+1, num);
        }
        int key = map.get(3);
        int ans [] = new int[3];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==key) ans[idx++] = i;
        }
        return (2*(Math.max(ans[0], Math.max(ans[1], ans[2]))-Math.min(ans[0], Math.min(ans[1], ans[2]))));
    }
}
