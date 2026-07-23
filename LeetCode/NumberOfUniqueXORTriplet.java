package LeetCode;

import java.util.HashSet;

public class NumberOfUniqueXORTriplet{
    public static void main(String[] args) {
        int [] nums = {5, 6, 7, 6, 6, 5};
        int ans = uniqueXorTriplets(nums);
        System.out.println(ans);
    }
    public static int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    int a = nums[i]^nums[j]^nums[k];
                    set.add(a);
                }
            }
        }
        System.out.println(set);
        return set.size();
        // if(n==1) return 1;
        // if(n==2) return 2;
        // return Integer.highestOneBit(n)<<1;
    }
}