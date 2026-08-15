package striverDsaSheet;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubarray {
    public static void main(String[] args) {
        int [] arr = {1000,4,200,1,3,2, 5, 10, 6, 7, 8, 9};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        // Arrays.sort(arr);
        // int max = 1;
        // int curr = 1;
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i]==arr[i-1]+1){
        //         curr++;
        //     }else if(arr[i]==arr[i-1]){
        //         continue;
        //     }else{
        //         curr=1;
        //     }
        //     if(curr>max){
        //         max=curr;
        //     }
        // }
        // return max;
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i]) && !set.contains(arr[i]-1)){
                int curr = 1;
                int a = arr[i];
                set.remove(a);
                while(set.contains(a+1)){
                    curr++;
                    a++;
                    set.remove(a);
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }
}
