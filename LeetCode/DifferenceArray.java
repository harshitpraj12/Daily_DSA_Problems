package LeetCode;

import java.util.Arrays;

public class DifferenceArray {
    public static void main(String[] args) {
        int [] arr = {4, 3, 5, 1, 6};
        int [][] lor = {{2, 4, 2}, {3, 4, -1}};
        System.out.println(Arrays.toString(arr));
        solve(arr, lor);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr, int[][] lo) {
        for(int [] ar : lo){
            int a = ar[0];
            int b = ar[1];
            int c = ar[2];
            for(int i=a; i<=b; i++){
                arr[i]+=c;
            }
        }
    }
}
