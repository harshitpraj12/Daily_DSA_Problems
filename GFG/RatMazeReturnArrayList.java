package GFG;

import java.util.ArrayList;
import java.util.Arrays;

public class RatMazeReturnArrayList {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 0, 0}, {3, 0, 0, 1}, {1, 0, 1, 0}, {0, 0, 0, 1}};
        ArrayList<ArrayList<Integer>> ans = solve(mat);
        for (ArrayList<Integer> row : ans) {
            System.out.println(row);
        }
    }

    private static ArrayList<ArrayList<Integer>> solve(int[][] mat) {
        int n = mat.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int [][] memo = new int[n][n];
        if(solution(mat, 0, 0, ans, n, memo)){
            return ans;
        }
        ArrayList<ArrayList<Integer>> failResult = new ArrayList<>();
        ArrayList<Integer> failRow = new ArrayList<>();
        failRow.add(-1);
        failResult.add(failRow);
        
        return failResult;
    }
}
