package GFG;

public class DiceThrow {
    static int [][] dp;
    public static void main(String[] args) {
        int n = 12;
        int m = 12;
        int x = 144;
        dp = new int[n+1][x+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=x; j++){
                dp[i][j]= -1;
            }
        }
        int ans = solve(n, m, x);
        System.out.println("Answer is : "+ ans);
    }

    private static int solve(int dice, int m, int sum) {
        if(dice==0 && sum==0) return 1;
        if(dice==0 || sum<0) return 0;

        if(dp[dice][sum]!=-1){
            return dp[dice][sum];
        }

        int ways = 0;

        for(int i=1; i<=m; i++){
            ways+=solve(dice-1, m, sum-i);
        }
        return dp[dice][sum]=ways;
    }
}
