package DynamicProgramming;

public class ClimbingStairs {
    static int count = 0;
    public static void main(String[] args) {
        int n = 40;
        int dp [] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i]=-1;
        }
        int ans = solve(n, dp);
        System.out.println("Answer is : "+ ans+" "+count);
        // Without memorization = Answer is : 165580141 535828591
        // With memorization = Answer is : 165580141 81
    }

    private static int solve(int n, int [] dp) {
        count++;
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];
        int oneStep = solve(n-1, dp);
        int twoStep = solve(n-2, dp);
        return dp[n] = oneStep+twoStep;
    }
}
