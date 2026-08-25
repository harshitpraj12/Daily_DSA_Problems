package striverDsaSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSumToTarget {
    public static void main(String[] args) {
        int [] arr = {1,0,-1,0,-2,2};
        int tar = 2;
        List<List<Integer>> ans = solve(arr, tar);
        System.out.println(ans);
    }

    private static List<List<Integer>> solve(int[] arr, int tar) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                if(sum==tar){
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while(left<right && arr[left]==arr[left+1]) left++;
                    while(left<right && arr[right]==arr[right-1]) right--;
                    left++;
                    right--;
                }else if(sum<tar){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
