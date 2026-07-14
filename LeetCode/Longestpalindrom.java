package LeetCode;

import Array.linearSearch;

public class Longestpalindrom {
    public static void main(String[] args) {
        String str = "babaabaf";
        String ans = solve(str);
        System.out.println(ans);
    }

    private static String solve(String str) {
        int n = str.length();
        int start = 0;
        int end = 0;
        for(int i=0; i<n; i++){
            int l1 = helper(str, i, i);
            int l2 = helper(str, i, i+1);
            int len = Math.max(l1, l2);
            if(len>end-start){
                start = i- (len-1)/2;
                end = i+len/2;
            }
        }
        return str.substring(start, end+1);
    }

    private static int helper(String str, int i, int i2) {
        while(i>=0 && i2<str.length() && str.charAt(i)==str.charAt(i2)){
            i--;
            i2++;
        }
        return i2-i-1;
    }
}
