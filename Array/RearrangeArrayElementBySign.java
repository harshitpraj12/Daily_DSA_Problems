package Array;

import java.util.Arrays;

public class RearrangeArrayElementBySign {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, -4, -1, -5};
        int [] nums = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};


        // Solve using O(n) Space complexity

        // int n = nums.length;
        // int pos [] = new int[n];
        // int neg [] = new int[n];
        // int po=0;
        // int ne=0;

        // for(int i=0; i<n; i++){
        //     if(nums[i]<0){
        //         neg[ne++] = nums[i];
        //     }else{
        //         pos[po++] = nums[i];
        //     }
        // }

        // po = 0;
        // ne = 0;
        // int idx = 0;

        // while(po<n/2 && ne<n/2){
        //     if(idx%2==0){
        //         nums[idx++] = pos[po++];
        //     }else{
        //         nums[idx++] = neg[ne++];
        //     }
        // }

        // while(po<n/2){
        //     nums[idx++] = pos[po++];
        // }

        // while (ne<n/2) {
        //     nums[idx++] = neg[ne++];
        // }

        // for(int q : nums){
        //     System.out.print(q+" ");
        // }

        // Solve  using O(n) time and O(1) space complexity

        int k = 0;
        for(int i=0; i<arr.length; i++){
            if((i%2==0 && arr[i]>0) || (i%2!=0 && arr[i]<0)){
                if(i==k) k++;
                continue;
            }else{
                if(k%2==0 && arr[i]>0){
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
                if(k%2!=0 && arr[i]<0){
                    int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                }
            }
            k++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
