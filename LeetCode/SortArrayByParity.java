package LeetCode;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr) {
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if((arr[i]&1)==0){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx++]=temp;
            }
        }
    }
}
