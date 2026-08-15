package tcs;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {
    public static void main(String[] args) {
        int [] arr = {2, 1, 2, 1, 1, 0, 0, 0, 2, 0, 1, 1, 2, 0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
