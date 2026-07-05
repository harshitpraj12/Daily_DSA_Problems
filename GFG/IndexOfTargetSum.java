package GFG;

import java.util.ArrayList;
import java.util.List;

public class IndexOfTargetSum {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 15;
        ArrayList<Integer> ans = solve(arr, target);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int[] arr, int target) {
        int sum = 0;
        int left = 0;
        int right = -1;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            right++;
            while(sum>target){
                sum-=arr[left++];
            }
            if(sum==target){
                return new ArrayList<>(List.of(left+1, right+1));
            } 
        }
        return new ArrayList<>(List.of(-1));
    }
}
