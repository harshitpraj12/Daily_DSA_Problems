package GFG;

import java.util.ArrayList;

public class KSizedSubarrayMaximum {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
    
        ArrayList<Integer> ans =  MaxSubarray(arr, k);
        System.out.println("Subarray is : "+ ans);
    }

    private static ArrayList<Integer> MaxSubarray(int[] arr, int k) {
        ArrayList<Integer> a = new ArrayList<>();
        if(k<=1){
            for(int e: arr){
                a.add(e);
            }
            return a;
        }
        for(int i=0; i<arr.length-k; i++){
            int max = arr[i];
            for(int j=i+1; j<i+k; j++){
                if(arr[j]>max){
                    max = arr[j];
                }
            }
            a.add(max);
        }
        return a;
    }
}
