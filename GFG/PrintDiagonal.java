package GFG;

import java.util.ArrayList;

public class PrintDiagonal {
    public static void main(String[] args) {
        int arr [][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> ans = solve(arr);
        System.out.println("[1, 2, 4, 3, 5, 7, 6, 8, 9]");
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int[][] mat) {
        int n = mat.length;
        ArrayList<Integer> result = new ArrayList<>();

        // There are (2n - 1) anti-diagonals in total
        // The sum of indices (i + j) ranges from 0 to 2n - 2
        for (int sum = 0; sum <= 2 * (n - 1); sum++) {
            
            /* For a fixed 'sum', we find the starting row 'i'.
               Since i + j = sum, then j = sum - i.
               Constraints: 
               1. 0 <= i < n
               2. 0 <= j < n  =>  0 <= sum - i < n  =>  i <= sum  AND  i > sum - n
            */
            
            int startRow = Math.max(0, sum - (n - 1));
            int endRow = Math.min(sum, n - 1);

            for (int i = startRow; i <= endRow; i++) {
                int j = sum - i;
                result.add(mat[i][j]);
            }
        }
        
        return result;
    }
}
