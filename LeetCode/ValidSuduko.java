package LeetCode;

public class ValidSuduko {
    public static void main(String[] args) {
        String [][] board = {
            {"5","3",".",".","7",".",".",".","."}
            ,{"6",".",".","1","9","5",".",".","."}
            ,{".","9","8",".",".",".",".","6","."}
            ,{"8",".",".",".","6",".",".",".","3"}
            ,{"4",".",".","8",".","3",".",".","1"}
            ,{"7",".",".",".","2",".",".",".","6"}
            ,{".","6",".",".",".",".","2","8","."}
            ,{".",".",".","4","1","9",".",".","5"}
            ,{".",".",".",".","8",".",".","7","9"}
            };
        if(valid(board)){
            System.out.println("Valid Suduko");
        }else{
            System.out.println("Not valid Suduko");
        }
    }

    private static boolean valid(String [][] board) {
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                String a = board[i][j];
                if(a.equals(".")) continue;
                if(!validation(board, i, j, a)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validation(String[][] board, int i, int j, String a) {
        for(int m=0; m<9; m++){
            if(m!=j && board[i][m].equals(a)){
                return false;
            }
        }
        for(int m=0; m<9; m++){
            if(m!=i && board[m][j].equals(a)){
                return false;
            }
        }
        int m = i/3;
        m*=3;
        int n = j/3;
        n*=3;
        for(int b=m; b<m+3; b++){
            for(int c=n; c<n+3; c++){
                if(b!=i && c!=j && board[b][c].equals(a)){
                    return false;
                }
            }
        }
        return true;
    }
}
