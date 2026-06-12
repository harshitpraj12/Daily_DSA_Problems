package Array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int [] arr = {3, 53, 4, 32, 87,3, 2, 5, 75, 34 ,23};
        int d = 3;
        int a [] = new int[d];
        for(int i=0; i<d; i++){
            a[i]=arr[i];
        }
        int idx=0;
        for(int i=d; i<arr.length; i++){
            arr[idx++]=arr[i];
        }
        for(int i=0; i<d; i++){
            arr[idx++]=a[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
