package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixPrac {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> ans = solve(mat);
        System.out.println(ans);
    }

    private static List<Integer> solve(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        if(mat==null && mat.length==0) return ans;
        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;
        

        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                ans.add(mat[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                ans.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--){
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--){
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
