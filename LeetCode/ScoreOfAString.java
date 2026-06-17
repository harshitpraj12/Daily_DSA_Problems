package LeetCode;

public class ScoreOfAString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(solve(s));
    }

    private static int solve(String s) {
        int ans = 0;
        for(int i=1; i<s.length(); i++){
            ans+=Math.abs(s.charAt(i-1)-s.charAt(i));
        }
        return ans;
    }
}
