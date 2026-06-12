package Array;

import java.util.Arrays;

public class sortOfTwoSortedArray {
    public static void main(String[] args) {
        int [] arr1 = {23, 45, 67, 68, 70};
        int [] arr2 = {1, 45, 67, 71, 72, 78, 98};
        int n = arr1.length;
        int m = arr2.length;
        int [] arr = new int[n+m];
        int a = 0;
        int b = 0;
        int idx=0;
        while(a<n && b<m){
            if(arr1[a]<arr2[b]){
                arr[idx++]=arr1[a++];
            }else{
                arr[idx++]=arr2[b++];
            }
        }
        while(a<n){
            arr[idx++]=arr1[a++];
        }
        while(b<m){
            arr[idx++]=arr2[b++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
