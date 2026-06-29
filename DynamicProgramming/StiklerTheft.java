package DynamicProgramming;

import java.util.Arrays;

public class StiklerTheft {
    static int [] dp;
    public static void main(String[] args) {
        int [] arr = {6, 5, 5, 7, 4};
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(solve(0, arr));
    }

    private static int solve(int i, int[] arr) {
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i] + solve(i+2, arr);
        int skip = solve(i+1, arr);
        int ans = Math.max(pick, skip);
        dp[i] = ans;
        return ans;
    }
}
