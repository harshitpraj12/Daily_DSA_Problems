package Array;

import java.util.Arrays;

public class movingZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {3, 5, 2, 0, 2, 0, 2 ,0 ,5, 9, 0, 7, 0};
        int idx = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[idx++]=arr[i];
            }
        }
        int a = idx;
        for(int i=a; i<n; i++){
            arr[idx++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
