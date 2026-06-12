package Array;

import java.util.Arrays;

public class SortZeroONeTwoArray {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        // Better Approach
        // int zero = 0;
        // int one = 0;
        // int two = 0;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==0){
        //         zero++;
        //     }
        //     if(arr[i]==1){
        //         one++;
        //     }
        //     if(arr[i]==2){
        //         two++;
        //     }
        // }
        // for(int i=0; i<zero; i++){
        //     arr[i]=0;
        // }
        // for(int i=zero; i<one+zero; i++){
        //     arr[i]=1;
        // }
        // for(int i=one+zero; i<one+two+zero; i++){
        //     arr[i]=2;
        // }
        // System.out.println(Arrays.toString(arr));

        // Optimal Approach (Dutch National Flag Algorithm)

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
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
