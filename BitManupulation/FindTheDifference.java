package BitManupulation;

public class FindTheDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char ans = solve(s, t);
        System.out.println(ans);
    }

    private static char solve(String s, String t) {
        char ans = ' '^' ';
        for(int i=0; i<s.length(); i++){
            ans^=s.charAt(i);
            ans^=t.charAt(i);
        }
        ans^=t.charAt(t.length()-1);
        return ans;
    }
}
