package tcs;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String str = "  a   good   example    ";
        String ans = solve(str);
        System.out.println(ans);
    }

    private static String solve(String str) {
        // str = str.trim();
        // str = str.replaceAll("\\s+", " ");
        String [] ans = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int a = ans.length-1; a>=0; a--){
            sb.append(ans[a]);
            if(a>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
