package GFG;

import java.time.LocalTime;
import java.util.ArrayList;

public class RatMazeWithMultipleJump {
    public static void main(String[] args) {
        int time = LocalTime.now().getNano();
        System.out.println(time);
        int[][] mat = {{2, 1, 0, 0}, {3, 0, 0, 1}, {1, 0, 1, 0}, {0, 0, 0, 1}};
        ArrayList<ArrayList<Integer>> ans = solve(mat);
        for (ArrayList<Integer> row : ans) {
            System.out.println(row);
        }
        int time2 = LocalTime.now().getNano();
        System.out.println((time2-time));
    }

    private static ArrayList<ArrayList<Integer>> solve(int[][] mat) {
        int m = mat.length;
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        int [][] ans = new int[m][m];
        int [][] memo = new int[m][m];
        if(solution(mat, 0, 0, ans, m, memo)){
            for(int i=0; i<m; i++){
                ArrayList<Integer> an = new ArrayList<>();
                for(int j=0; j<m; j++){
                    an.add(ans[i][j]);
                }
                sol.add(an);
            }
            return sol;
        }
        ArrayList<Integer> an = new ArrayList<>();
        an.add(-1);
        sol.add(an);
        return sol;
    }

    private static boolean solution(int[][] mat, int i, int j, int[][] ans, int n, int [][] memo) {
        if(i==n-1 && j==n-1){
            ans[i][j]=1;
            return true;
        }
        if(i>=n || j>=n || mat[i][j]==0){
            return false;
        }
        if(memo[i][j]==-1){
            return false;
        }
        ans[i][j]=1;
        int maxJump = mat[i][j];
        for(int k=1; k<=maxJump; k++){
            if(solution(mat, i, j+k, ans, n, memo)){
                return true;
            }
            if(solution(mat, i+k, j, ans, n, memo)){
                return true;
            }
        }
        memo[i][j]=-1;
        ans[i][j]=0;
        return false;
    }
}
