package LeetCodeContest;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumTotalSum {
    public static void main(String[] args) {
        int [] nums = {6,1,2,9};
        int k = 3;
        int mul = 2;
        System.out.println(solve(nums, k, mul));
    }

    private static long solve(int[] nums, int k, int mul) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++){
            que.add(nums[i]);
        }
        long ans = 0;
        for(int i=0; i<k; i++){
            int a = que.poll();
            if(mul>0){
                ans+=(long)(mul--)*a;
            }else{
                ans+=a;
                break;
            }
        }
        return ans;
    }
    
}
