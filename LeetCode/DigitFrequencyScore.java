package LeetCode;

import java.util.HashMap;

public class DigitFrequencyScore {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(solve(n));
    }

    private static int solve(int n) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        while(n!=0){
            int a = n%10;
            // map.put(a, map.getOrDefault(a, 0)+1);
            ans+=a;
            n/=10;
        }
        // System.out.println(map.entrySet());
        // map.
        return ans;
    }
}
