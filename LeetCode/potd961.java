package LeetCode;

// import java.util.HashMap;
import java.util.HashSet;
// import java.util.Map;
import java.util.Set;

public class potd961 {
    public static int repeatedNTimes(int[] nums) {
        // int n = nums.length;
        // int ele = n/2;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int e : nums){
        //     map.put(e, map.getOrDefault(e, 0)+1);
        // }
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     if (entry.getValue() == ele) {
        //         return entry.getKey();
        //     }
        // }
        // return 0;

        // Optimized code 
        
        Set<Integer> s = new HashSet<>();
        for(int i:nums)
        {
            if(!s.add(i))
              return i;
        }
        return nums[nums.length-1];

    }
    public static void main(String[] args) {
        int nums[] = {5,1,5,2,5,3,5,4};
        int ans = repeatedNTimes(nums);
        System.out.println("Answer is : "+ ans);
    }
}
