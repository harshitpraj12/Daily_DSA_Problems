package striverDsaSheet;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int k = 3;
        int ans = solve(nums, k);
        System.out.println(ans);
    }

    private static int solve(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0, 1);
        for(int num : nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
