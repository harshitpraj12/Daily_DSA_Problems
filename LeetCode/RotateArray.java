package LeetCode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        //
        int k = 3;
        solve(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr, int k){
        int n = arr.length;
        k%=n;
        rotate(arr, 0, k);
        rotate(arr, k+1, n-1);
        rotate(arr, 0, n-1);
    }

    private static void rotate(int[] arr, int i, int k) {
        int left = i;
        int right = k;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
