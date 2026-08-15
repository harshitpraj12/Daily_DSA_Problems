package LeetCode;

public class MaxProductOfSubarray {
    public static void main(String[] args) {
        int [] arr = {1,2,-3,0,-4,-5};
        int ans = solve(arr);
        System.out.println(ans);
    }

    private static int solve(int[] arr) {
        int max = Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(pre==0) pre = 1;
            if(suf==0) suf = 1;
            pre*=arr[i];
            suf*=arr[n-i-1]; 
            max = Math.max(max, Math.max(pre, suf));
        }
        return max;
    }
}
