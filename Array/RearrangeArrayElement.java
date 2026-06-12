package Array;

import java.util.Arrays;

public class RearrangeArrayElement {
    public static void main(String[] args) {
        int [] arr = {3, 1, -2, -5, 2, -4};
        int n = arr.length;
        int pi=0;
        int [] pos = new int[n/2];
        int ni=0;
        int [] neg = new int[n/2];
        for(int i =0; i<n; i++){
            if(arr[i]>0){
                pos[pi++]=arr[i];
            }else{
                neg[ni++]=arr[i];
            }
        }
        for(int i=0; i<n/2; i++){
            arr[2*i]=pos[i];
        }
        for(int i=0; i<n/2; i++){
            arr[2*i+1]=neg[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
