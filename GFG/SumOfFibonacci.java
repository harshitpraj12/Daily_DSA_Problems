package GFG;

public class SumOfFibonacci {
    static int mod = 1000000007;
    public static void main(String[] args) {
        int n = 62;
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        long pre = 0;
        long next = 1;
        long sum = 1;
        for(int i=2; i<=n; i++){
            long curr = (pre + next)%mod;
            sum = (sum + curr)%mod;
            pre = next;
            next = curr;
        }
        return (int)sum;
    }
}
