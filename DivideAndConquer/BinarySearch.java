package DivideAndConquer;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-23, 34, 65, 2, 8, -2, 64, 87, 21, 45};
        int ele = 45;
        // for Binary search array should be shorted----
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        int result = binarySearch(arr, l, r, ele);
        System.out.println("Element "+ele +" is at index: "+ result);
    }

    private static int binarySearch(int[] arr, int l, int r, int ele) {
        if(l==r){
            if(ele == arr[l]){
                return l;
            }else{
                return -1;
            }
        }else{
            int mid = l+(r-l)/2;
            if(arr[mid]==ele){
                return mid;
            }else if(ele > arr[mid]){
                return binarySearch(arr, mid+1, r, ele);
            }else{
                return binarySearch(arr, l, mid-1, ele);
            }
        }
    }
}
