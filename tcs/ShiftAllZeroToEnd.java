package tcs;

import java.util.Arrays;

public class ShiftAllZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {6,0,0,0,5,0};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void solve(int[] arr) {
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i]!=0) continue;
        //     for(int j = i+1; j<arr.length; j++){
        //         if(arr[j]!=0){
        //             int temp = arr[j];
        //             arr[j] = arr[i];
        //             arr[i] = temp;
        //             break;
        //         }
        //     }
        // }
        int count = 0;
        int idx=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]!=0){
                arr[idx++]=arr[i];
            }else{
                count++;
            }
        }
        for(int i=arr.length-count+1; i<arr.length; i++){
            arr[idx++]=0;
        }
    }
}
