package LeetCode;

import java.util.Arrays;

public class PartitionArrayAccordingToPivot {
    public static void main(String[] args) {
        int[] arr = {9,12,5,10,14,3,10};
        int pivot = 10;
        int [] ans = solve(arr, pivot);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(int[] arr, int pivot) {
        int ans [] = new int[arr.length];
        // int idx = 0;
        // for(int j = 0; j<arr.length; j++){
        //     if(arr[j]<pivot) ans[idx++] = arr[j];
        // }
        // for(int j = 0; j<arr.length; j++){
        //     if(arr[j]==pivot) ans[idx++] = arr[j];
        // }
        // for(int j = 0; j<arr.length; j++){
        //     if(arr[j]>pivot) ans[idx++] = arr[j];
        // }
        // return ans;
        int n = arr.length;
        int left = 0;
        int right = n-1;
        for(int i=0, j=n-1; i<n && j>=0; i++, j--){
            if(arr[i]<pivot) ans[left++]=arr[i];
            if(arr[j]>pivot) ans[right--]=arr[j];
        }
        while(left<=right){
            ans[left++]=pivot;
        }
        return ans;
    }
}
