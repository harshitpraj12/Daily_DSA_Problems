package GFG;

import java.util.HashMap;

public class LongestSubarrayMajorityGreaterThanK {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 1, 6};
        int k = 2;
        int ans = longestSubArray(arr, k);
        System.out.println("Answer is : "+ ans);
    }

    private static int longestSubArray(int[] arr, int k) {
        int maxLength = 0;
        int currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>k){
                currSum+=1;
            }else{
                currSum-=1;
            }

            if(currSum>0){
                maxLength = i+1;
            }else{
                if(map.containsKey(currSum-1)){
                    maxLength = Math.max(maxLength, i-map.get(currSum-1));
                }
            }

            if(!map.containsKey(currSum)){
                map.put(currSum, i);
            }

        }
        System.out.println("helo : "+map.size());
        return maxLength;
    }
}
