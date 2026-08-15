package tcs;

public class FoundIndexOfSubstring {
    public static void main(String[] args) {
        String str = "Life is all about how you connect the dots";
        String s = "all";
        int ans = solve(str, s);
        System.out.println(ans);
    }

    private static int solve(String str, String s) {
        int a = str.lastIndexOf("is");
        System.out.println(a);
        return str.indexOf(s);
    }
}
