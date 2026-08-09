package striverDsaSheet;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        solve(arr);
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }

    private static void solve(int[][] arr) {
        int n = arr.length;
        int [] a = new int[n*n];
        int idx = 0;
        for(int j=0; j<n; j++){
            for(int i=n-1; i>=0; i--){
                a[idx++]=arr[i][j];
            }
        }
        idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=a[idx++];
            }
        }
    }
}
