package GFG;

public class WaysToWriteN {
    public static void main(String[] args) {
        int n = 8;
        int ans = solve(n);
        System.out.println(ans);
    }

    private static int solve(int n) {
        int MOD = 1000000007; // Required by the problem to prevent overflow
        
        // dp[i] represents the number of ways to get the sum i
        int[] dp = new int[n + 1];
        
        // Base case: 1 way to make a sum of 0
        dp[0] = 1;
        
        // Pick each number from 1 to n-1 as our "coin"
        for (int i = 1; i < n; i++) {
            
            // Try to make every sum 'j' from 'i' up to 'n'
            for (int j = i; j <= n; j++) {
                
                // Add the number of ways we could make the sum (j - i)
                dp[j] = (dp[j] + dp[j - i]) % MOD;
            }
        }
        
        // The answer for 'n' is stored at the last index
        return dp[n];
    }
}
