package LeetCode;

import java.util.PriorityQueue;

public class KthLargestElementInArray215 {

    public static void main(String[] args) {
        int [] nums = {3, 2, 1, 5, 6, 4};
        int k = 4;
        int ans = method(nums, k);
        System.out.println("Element "+ ans);
    }

    private static int method(int[] nums, int k) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for(int num : nums){
            a.add(num);
            if(a.size()>k){
                a.poll();
            }
        }
        return a.peek();
    }
}
