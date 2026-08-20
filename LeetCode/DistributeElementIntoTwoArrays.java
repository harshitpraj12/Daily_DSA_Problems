package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class DistributeElementIntoTwoArrays {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int [] ans = solve(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2; i<nums.length; i++){
            if(arr1.getLast()>arr2.getLast()){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        // int [] result = new int[nums.length];
        // int idx = 0;
        // while(!arr1.isEmpty()){
        //     result[idx++]=arr1.removeFirst();
        // }
        // while(!arr2.isEmpty()){
        //     result[idx++]=arr2.removeFirst();
        // }
        int[] result = new int[nums.length];
        int idx = 0;
        for (int val : arr1) {
            result[idx++] = val;
        }
        for (int val : arr2) {
            result[idx++] = val;
        }
        return result;
    }
}
