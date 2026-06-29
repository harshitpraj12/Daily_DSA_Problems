package GFG;

public class MaximumDotProduct {
    public static void main(String[] args) {
        // int [] a = {2, 3, 1, 7, 8};
        // int [] b = {3, 6, 7};
        int [] a = {5, 8, 7, 9, 6};
        int [] b = {4, 4};
        int ans = solve(a, b);
        System.out.println(ans);
    }

    private static int solve(int[] a, int[] b) {
        int n = a.length; //5
        int m = b.length; //3
        // int ans = 0;
        // for(int i=0; i<m; i++){
        //     int max = 0;
        //     for(int j = 0; j<n-m+i+1; j++){
        //         int dot = b[i]*a[j];
        //         max = Math.max(max, dot);
        //     }
        //     System.out.println("Max: "+ max);
        //     ans+=max;
        // }
        // return ans;
        long[] prevDp = new long[m + 1];

        for (int i = 1; i <= n; i++) {
            // currDp represents dp[i]
            long[] currDp = new long[m + 1];
            
            for (int j = 1; j <= m; j++) {
                if (i >= j) {
                    // Choice 1: Skip a[i-1] (look at the same column in the previous row)
                    long skip = prevDp[j];
                    
                    // Choice 2: Pair a[i-1] with b[j-1] (look at diagonal left in previous row)
                    long pairElements = prevDp[j - 1] + (long) a[i - 1] * b[j - 1];
                    
                    currDp[j] = Math.max(skip, pairElements);
                }
            }
            // The current row becomes the previous row for the next iteration
            prevDp = currDp;
        }
        
        return (int)prevDp[m];
    }
}
