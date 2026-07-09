package GFG;

import java.util.Arrays;

public class LargestUnblockedSubmatrix {
    public static void main(String[] args) {
        int n = 5, m=5;
        int [][] arr = {{2, 3}, {5, 1}};
        System.out.println(solve(n, m, arr));
    }

    private static int solve(int n, int m, int[][] arr) {
        int [] extRow = new int[arr.length+2];
        int [] extCol = new int[arr.length+2];
        for(int i=0; i<arr.length; i++){
            extRow[i]=arr[i][0];
            extCol[i]=arr[i][1];
        }
        extRow[arr.length]=0;
        extCol[arr.length]=0;
        extRow[arr.length+1]=n+1;
        extCol[arr.length+1]=m+1;
        Arrays.sort(extRow);
        Arrays.sort(extCol);
        int maxRow = 0;
        int maxCol = 0;
        int a = extRow[0];
        int b = extCol[0];
        for(int i=1; i<extCol.length; i++){
            maxRow = Math.max(maxRow, extRow[i]-a-1);
            maxCol = Math.max(maxCol, extCol[i]-b-1);
            a = extRow[i];
            b = extCol[i];
        }
        return maxRow*maxCol;
    }
}
