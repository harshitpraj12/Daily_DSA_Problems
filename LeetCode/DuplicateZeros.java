package LeetCode;

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(arr));
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr) {
        int n = arr.length;
        // int start = 0;
        // int end = n-1;
        // while(start<=end){
        //     if(arr[start]==0){
        //         end--;
        //     }
        //     start++;
        // }
        // if(arr[end+1]==0) end++;
        // System.out.println(end);
        // System.out.println(start);
        // int idx = n-1;
        // if(arr[end]==0) arr[idx--]=0;
        // for(int i=end-1; i>=0; i--){
        //     if(arr[i]==0){
        //         arr[idx--]=0;
        //         arr[idx--]=0;
        //     }else{
        //         arr[idx--]=arr[i];
        //     }
        // }

        // second approach to solve this problem in TC-O(n) & SC-O(n)
        // int [] copy = new int[n];
        // int s = 0;
        // int t = 0;
        // while (s < n) {
        //     if (arr[t] == 0) {
        //         copy[s++] = 0;
        //         if (s < n) {
        //             copy[s++] = 0;
        //         }
        //     } else {
        //         copy[s++] = arr[t];
        //     }
        //     t++;
        // }
        // System.out.println("copy : "+Arrays.toString(copy));
        // for(int i=0; i<n; i++){
        //     arr[i] = copy[i];
        // }

        // Third approach to solve this problem 
        
    }
}
