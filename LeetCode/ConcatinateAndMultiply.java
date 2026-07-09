package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class ConcatinateAndMultiply {
    public static void main(String[] args) {
        String str = "9876543210";
        int [][] queries = {{0, 9}};
        int [] ans = solve(str, queries);
        System.out.println(Arrays.toString(ans));
    }
// 444444137
    private static int[] solve(String str, int[][] queries) {
        int n = str.length();
        int mod = 1000000007;
        long [] power = new long[n+1];
        power[0] = 0;
        for(int i=1; i<=n; i++){
            power[i] = (power[i-1]*10)%mod;
        }
        long [] prefixSum = new long[n+1];
        long [] prefixNum = new long[n+1];
        for(int i=0; i<n; i++){
            int digit = str.charAt(i)-'0';
            prefixSum[i+1]=prefixSum[i]+digit;
            prefixNum[i+1]=(prefixNum[i]*10+digit)%mod;
        }
        int [] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            long rangeSum = prefixSum[b+1]-prefixSum[a];
            long rangeNum = (prefixNum[b + 1] - (prefixNum[a] * power[b - a + 1]) % mod + mod) % mod;
            long result = (rangeSum*(rangeNum%mod)) % mod;
            ans[i]=(int)result;
        }
        return ans;
    }
}
