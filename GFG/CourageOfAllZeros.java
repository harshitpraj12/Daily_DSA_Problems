package GFG;

public class CourageOfAllZeros {
    public static void main(String[] args) {
        int [][] arr = {{1, 1, 1, 0},{1, 0, 0, 1},{1, 1, 1, 0},{1, 0, 0, 1}};
        // 1, 1, 1, 0
        // 1, 0, 0, 1
        // 1, 1, 1, 0
        // 1, 0, 0, 1
        int ans = solve(arr); 
        System.out.println(ans);
    }

    private static int solve(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
                    ans+=once(mat, i, j, m, n);
                }
            }
        }
        return ans;
    }

    private static int once(int[][] mat, int i, int j, int m, int n) {
        int ans=0;
        // right
        for(int s=j; s<n; s++){
            if(mat[i][s]==1){
                ans+=1;
                break;
            }else{
                continue;
            }
        }
        // left
        for(int s=j; s>=0; s--){
            if(mat[i][s]==1){
                ans+=1;
                break;
            }else{
                continue;
            }
        }
        // up
        for(int s=i; s>=0; s--){
            if(mat[s][j]==1){
                ans+=1;
                break;
            }else{
                continue;
            }
        }
        // down
        for(int s=i; s<m; s++){
            if(mat[s][j]==1){
                ans+=1;
                break;
            }else{
                continue;
            }
        }
        return ans;
    }
}
