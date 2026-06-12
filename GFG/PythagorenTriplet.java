package GFG;

import java.util.Arrays;

public class PythagorenTriplet {
    public static void main(String[] args) {
        int [] arr = {3, 2, 4, 6, 5};
        if(solve(arr)){
            System.out.println("Yes this is pythagoren triplet");
        }else{
            System.out.println("No this is not pythagoren triplet");
        }
    }

    private static boolean solve(int[] arr) {
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = arr[i]*arr[i];
        // }
        // Arrays.sort(arr);
        // int n = arr.length;
        // for(int i=n-1; i>=0; i--){
        //     int left = 0;
        //     int right = i-1;
        //     while(left<right){
        //         if(arr[left]+arr[right]==arr[i]){
        //             return true;
        //         }else if(arr[left]+arr[right]>arr[i]){
        //             right--;
        //         }else{
        //             left++;
        //         }
        //     }
        // }
        // return false;
        int max = 0;
    for (int x : arr) max = Math.max(max, x);

    int[] hash = new int[max + 1];
    for (int x : arr) hash[x]++;

    // Iterate through all possible values of a and b
    for (int i = 1; i <= max; i++) {
        if (hash[i] == 0) continue;

        for (int j = 1; j <= max; j++) {
            // Handle case where a and b are same (need at least 2 of them)
            if ((i == j && hash[i] <= 1) || hash[j] == 0) continue;

            int val = (i * i) + (j * j);
            int res = (int) Math.sqrt(val);

            // Check if it's a perfect square and exists in array
            if (res * res == val && res <= max && hash[res] > 0) {
                return true;
            }
        }
    }
    return false;
    }
}
