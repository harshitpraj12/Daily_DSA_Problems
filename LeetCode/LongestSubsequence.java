package LeetCode;

public class LongestSubsequence {
    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 6, 7, 8};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int x = 0;
        boolean zero = true;
        for(int n : arr){
            x^=n;
            if(n!=0) zero=false;
        }
        if(zero) return 0;
        return ((x==0)?arr.length-1:arr.length);
    }
}
