package GFG;

import java.util.HashMap;

public class LongestCommonSpanSumProblem {
    public static void main(String[] args) {
        int [] a1 = {0, 1, 0, 0, 0, 0};
        int [] a2 = {1, 0, 1, 0, 0, 1};

        // int n = a1.length;
        // // Map to store (prefixSum, first_index_where_it_occurred)
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // int prefixSum = 0;
        // int maxLen = 0;

        // for (int i = 0; i < n; i++) {
        //     // Calculate the difference and add to running prefix sum
        //     prefixSum += (a1[i] - a2[i]);

        //     // If prefixSum is 0, the span from index 0 to i has equal sums
        //     if (prefixSum == 0) {
        //         maxLen = i + 1;
        //     }

        //     // If this prefixSum has been seen before
        //     if (map.containsKey(prefixSum)) {
        //         // Calculate length from the first occurrence to current index
        //         int currentLen = i - map.get(prefixSum);
        //         maxLen = Math.max(maxLen, currentLen);
        //     } else {
        //         // Store the first index of this prefixSum
        //         map.put(prefixSum, i);
        //     }
        // }

        // System.out.println("Ans is : "+ maxLen);

        int [] arr = new int[a1.length];

        for(int i =0; i<a1.length; i++){
            arr[i]+=(a1[i]-a2[i]);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
