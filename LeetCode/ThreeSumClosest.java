package LeetCode;

import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int [] arr = {-1,2,1,-4};
        int target = 1;
        int list = solve(arr, target);
        System.out.println(list);
    }

    private static int solve(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        int closestSum = arr[0]+arr[1]+arr[2];
        for(int i=0; i<n-2; i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int currSum = arr[i]+arr[left]+arr[right];
                if(currSum==target) return currSum;
                if(Math.abs(closestSum-target)>Math.abs(currSum-target)){
                    closestSum = currSum;
                }
                if(currSum>target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return closestSum;
    }
}
