package GFG;

public class NumberOfSubMatrixOfSumK {
    public static void main(String[] args) {
        int[][] mat = {{2, 4, 7, 8, 10}, {3, 1, 1, 1, 1}, {9, 11, 1, 2, 1}, {12, -17, 1, 1, 1}};
        int k = 10;
        int ans = solve(mat, k);
        System.out.println("Answer is : "+ ans);
    }

    private static int solve(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;
        int pre [][] = new int[n+1][m+1];
        for(int i =0; i<n; i++){
            for(int j = 0; j<m; j++){
                pre[i+1][j+1] = mat[i][j]+pre[i][j+1]+pre[i+1][j]-pre[i][j];
            }
        }
        int count = 0;
        
        for(int size = 1; size<=Math.min(n, m); size++){
            for(int i=0; i<=n-size; i++){
                for(int j =0; j<=m-size; j++){
                    int total = pre[i+size][j+size]-pre[i+size][j]-pre[i][j+size]+pre[i][j];
                    if(total==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
