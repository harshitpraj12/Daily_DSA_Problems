package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumAreaBetweenBars {
    public static void main(String[] args) {
        List<Integer> height = List.of(2, 5, 4, 3, 7);
        int ans = solve(height);
        System.out.println(ans);
    }

    private static int solve(List<Integer> height) {
        int ans = 0;
        int left = 0;
        int right = height.size()-1;
        while(left<right){
            int width = right-left-1;
            int area = Math.min(height.get(left), height.get(right));
            ans= Math.max(ans, area*width);
            if(height.get(left)<height.get(right)){
                left++;
            }else{
                right--;
            }
        }
        // int right = arr.length-1;
        // while(left<right){
        //     int a = Math.min(min[left], max[right])*(right-left-1);
        //     ans = Math.max(ans, a);
        //     if(arr[left]<arr[right]){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        return ans;
    }
}
