package GFG;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        int mat [][] = {{6, 7, 8},{4, 6, 7},{1, 4, 6}};
        if(solve(mat)){
            System.out.println("Yes this is Toeplitz Matrix");
        }else{
            System.out.println("No this is not Toeplitz Matrix");
        }
    }

    private static boolean solve(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(mat[i][j]!=mat[i-1][j-1]) return false;
            }
        }
        return true;
    }
}
