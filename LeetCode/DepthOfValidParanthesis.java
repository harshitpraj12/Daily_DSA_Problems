package LeetCode;

import java.util.Arrays;

public class DepthOfValidParanthesis {
    public static void main(String[] args) {
        String s = "()(())()";
        int [] ans = solve(s);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] solve(String s) {
        int n = s.length();
        int [] ans = new int[n];
        int depth = 0;
        int idx = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                ans[idx]=depth%2;
                depth++;
                idx++;
            }else if(ch==')'){
                depth--;
                ans[idx]=depth%2;
                idx++;
            }
        }
        return ans;
    }
}
