package LeetCode;

import java.util.Arrays;

public class SortTheStudentByKthExam {
    public static void main(String[] args) {
        int [][] score = {{10, 6, 9, 1}, {7, 5, 11, 2}, {4, 8, 3, 15}};

        int k = 2;
        int [][] ans = solve(score, k);
        for(int i=0; i<ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    private static int[][] solve(int[][] score, int k) {
        int m = score.length;
        
        for(int i=0; i<m; i++){
            int max = score[i][k];
            int idx = i;   
            for(int j=i+1; j<m; j++){
                int val = score[j][k];
                if(val>max){
                    max = val;
                    idx=j;
                }
            }
            swap(score, i, idx);
        }
        return score;
    }

    private static void swap(int[][] score, int i, int idx) {
        int [] temp = score[i];
        score[i] = score[idx];
        score[idx] = temp;
    }
}
