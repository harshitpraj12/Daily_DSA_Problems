package striverDsaSheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class SetMatrixZero {
    public static void main(String[] args) {
        int [][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        for(int [] ar : matrix){
            System.out.println(Arrays.toString(ar));
        }
        System.out.println();
        solve(matrix);
        for(int [] ar : matrix){
            System.out.println(Arrays.toString(ar));
        }
    }

    private static void solve(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        //  this is using time complexity of O(n*m) and space complexity of O(n+m);
        // HashSet<Integer> row = new HashSet<>();
        // HashSet<Integer> col = new HashSet<>();
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(matrix[i][j]==0){
        //             row.add(i);
        //             col.add(j);
        //         }
        //     }
        // }
        // for(int k : row){
        //     for(int i=0; i<m; i++){
        //         matrix[k][i]=0;
        //     }
        // }
        
        // for(int k : col){
        //     for(int i=0; i<n; i++){
        //         matrix[i][k]=0;
        //     }
        // }

        int col0 = 1;
        for(int i=0; i<n; i++){
            if(matrix[i][0]==0) col0=0;
            for(int j=1; j<m; j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int j=0; j<m; j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(int i=0; i<n; i++){
                matrix[i][0]=0;
            }
        }
    }
}
