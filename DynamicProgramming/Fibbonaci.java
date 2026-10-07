package DynamicProgramming;

public class Fibbonaci {
    static int [] dp;
    public static void main(String[] args) {
        int n = 40;
        long time1 = System.currentTimeMillis();
        System.out.println(solve(n));
        System.out.println((System.currentTimeMillis()-time1));
        long time2 = System.currentTimeMillis();
        dp = new int[n+1];
        int ans = fib(n);
        System.out.println(ans);
        System.out.println(System.currentTimeMillis()-time2);
    }
    private static int solve(int n) {
        if(n<=1) return n;
        return solve(n-1)+solve(n-2);
	}
	private static int fib(int n) {
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n]=fib(n-1)+fib(n-2);
    }
}
