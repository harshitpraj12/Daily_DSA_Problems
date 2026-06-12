package DynamicProgramming;

public class FibbonacciSeries {
    static int count=0;
    static int normalCount = 0;

    // if you are using dynamic programming this for n=8 you have to 15 recurssion calls.
    // And if normal way then for n=8 you have 67 reccursion calls.
    // for this small number there is 67-15=52 difference.

    public static void main(String[] args) {
        int n = 41;
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 44
        int ans = solve(n);
        int res = fibb(n);
        System.out.println("Answer is : "+ ans+" "+ count);
        System.out.println("Fibb : "+ res+" "+ normalCount);
    }
    private static int fibb(int n) {
        normalCount++;
        if(n<=1){
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
    private static int solve(int n) {
        int [] dp = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        return fib(n, dp);
    }
    private static int fib(int n, int[] dp) {
        count++;
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fib(n-2, dp)+fib(n-1, dp);
    }
}
