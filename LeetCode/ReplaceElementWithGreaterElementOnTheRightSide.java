package LeetCode;

import java.util.Arrays;

public class ReplaceElementWithGreaterElementOnTheRightSide {
    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr) {
        // int n = arr.length;
        // int temp = arr[n-1];
        // int tem = arr[n-2];
        // for(int i=n-1; i>=0; i--){
        //     arr[i]=Math.max(temp, tem);
        //     temp = arr[i];
        //     tem = arr[i-1];
        // }
        int maxSoFar = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, current);
        }
    }
}
