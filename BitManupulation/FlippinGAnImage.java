package BitManupulation;

import java.util.Arrays;

public class FlippinGAnImage {
    public static void main(String[] args) {
        int [][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int [][] ans = solve(arr);
        for(int [] a : ans){
            System.out.println(Arrays.toString(a));
        }
    }

    private static int[][] solve(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int [][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=m-1; j>=0; j--){
                if(arr[i][j]==1){
                    ans[i][m-j-1]=0;
                }else{
                    ans[i][m-j-1]=1;
                }
            }
        }
        return ans;

    }
}
