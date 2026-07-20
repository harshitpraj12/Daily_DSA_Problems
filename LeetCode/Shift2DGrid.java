package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        int [][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 3;
        List<List<Integer>> ans = solve(grid, k);
        System.out.println(ans);
    }

    private static List<List<Integer>> solve(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        int [] arr = new int[n*m];
        int idx = 0;
        for(int [] ar : grid){
            for(int a : ar){
                arr[idx++]=a;
            }
        }
        System.out.println(Arrays.toString(arr));
        k=k%(n*m);
        if(k==0){
            for(int [] ar : grid){
                List<Integer> list = new ArrayList<>();
                for(int a : ar){
                    list.add(a);
                }
                ans.add(list);
            }
            return ans;
        }
        int [] rot = new int[k];
        for(int i=n*m-k; i<n*m; i++){
            rot[i+(k-n*m)]=arr[i];
        }
        for(int i=n*m-k-1; i>=0; i--){
            arr[i+k]=arr[i];
        }
        for(int i=0; i<k; i++){
            arr[i]=rot[i];
        }
        System.out.println(Arrays.toString(arr));
        idx=0;
        for(int i=0; i<n; i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0; j<m; j++){
                a.add(arr[idx++]);
            }
            ans.add(a);
        }
        return ans;
    }
}
