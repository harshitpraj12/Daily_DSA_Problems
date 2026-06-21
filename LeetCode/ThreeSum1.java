package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum1 {
    public static void main(String[] args) {
        int arr [] = {7, 3, 8, 2, 4, 1, 6};
        int target = 13;
        List<List<Integer>> ans = solve(arr, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> solve(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            int a = arr[i];
            int left = i+1;
            int right = arr.length-1;
            int ss = target-a;
            while (left<right) {
                List<Integer> aa = new ArrayList<>();
                if(arr[left]+arr[right]==ss){
                    aa.add(i);
                    aa.add(left);
                    aa.add(right);
                    ans.add(aa);
                }
                left++;
                right--;
            }
        }
        return ans;
    }
}
