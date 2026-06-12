package GFG;

import java.util.ArrayList;
import java.util.List;

public class ClosestPairOfToSortedArray {

    public static void main(String[] args) {
        int [] arr1={1, 4, 5, 7};
        int [] arr2={10, 20, 30, 40};
        int x = 32;
        ArrayList<Integer> ans = solve(arr1, arr2, x);
        System.out.println("Ans is : "+ ans);
    }

    private static ArrayList<Integer> solve(int[] arr1, int[] arr2, int x) {
        int n = arr1.length;
        int m = arr2.length;
        
        // Pointers for both arrays
        int left = 0;          // Start of arr1 (smallest)
        int right = m - 1;     // End of arr2 (largest)
        
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        
        // Result placeholders
        int resLeft = -1, resRight = -1;

        while (left < n && right >= 0) {
            int currentSum = arr1[left] + arr2[right];
            int currentDiff = Math.abs(currentSum - x);
            
            // Update the closest pair found so far
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                resLeft = arr1[left];
                resRight = arr2[right];
            }

            // If we found a perfect sum, we can stop immediately
            if (currentSum == x) {
                break;
            }
            
            // If sum is less than x, we need a larger sum (move left pointer right)
            if (currentSum < x) {
                left++;
            } 
            // If sum is greater than x, we need a smaller sum (move right pointer left)
            else {
                right--;
            }
        }
        
        result.add(resLeft);
        result.add(resRight);
        return result;
    }
}