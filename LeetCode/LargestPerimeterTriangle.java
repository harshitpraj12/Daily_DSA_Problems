package LeetCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int [] arr = {1,2,1,10};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] nums) {
        int maxPeri = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for(int i=0; i<nums.length-2; i++){
            int a = nums[i];
            int b = nums[i+1];
            int c = nums[i+2];
            if((b+c)>a){
                int ans = a+b+c;
                maxPeri = Math.max(ans, maxPeri);
            }
        }
        return maxPeri;
    }
}
