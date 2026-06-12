package GFG;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int [] arr = {3, 1, 2, 2, 2, 2};
        int a = solve(arr);
        System.out.println("Longest SubArray is : "+ a);
    }

    private static int solve(int[] arr) {
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int l = 0;
        
        for(int r=0; r<n; r++){
            map.put(arr[r], map.getOrDefault(arr[r], 0)+1);

            while(map.size()>2){
                map.put(arr[l], map.getOrDefault(arr[l], 0) -1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
        }
        System.out.println(map);
        return maxLen;
    }
}
