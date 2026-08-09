package striverDsaSheet;

import java.util.Arrays;

public class MergeInterval {
    public static void main(String[] args) {
        int [][] arr = {{1, 3}, {2, 3}, {8, 10}, {15, 18}};
        int [][] ans = solve(arr);
        System.out.println();
        for(int [] a : ans){
            System.out.println(Arrays.toString(a));
        }
    }

    private static int[][] solve(int[][] arr) {
        // Brute force approach
        Arrays.sort(arr, (a, b)-> {
            if(a[0]!=b[0]){
                return Integer.compare(a[0], b[0]);
            }else{
                return Integer.compare(a[1], b[1]);
            }
        });
        System.out.println("Sorted: ");
        for(int [] a : arr){
            System.out.println(Arrays.toString(a));
        }
        int [][] ans = new int[arr.length][2];
        ans[0][0]=arr[0][0];
        ans[0][1]=arr[0][1];
        int ansIdx = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i][0]<=ans[ansIdx][1]){
                ans[ansIdx][1] = Math.max(ans[ansIdx][1], arr[i][1]);
            }else{
                ansIdx++;
                ans[ansIdx][0]=arr[i][0];
                ans[ansIdx][1]=arr[i][1];
            }
        }
        int [][] an = new int[ansIdx+1][2];
        for(int i=0; i<=ansIdx; i++){
            an[i][0]=ans[i][0];
            an[i][1]=ans[i][1];
        }
        return an;
    }
}
