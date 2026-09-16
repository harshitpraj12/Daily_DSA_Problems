package LeetCode;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = solve(s);
        System.out.println(ans+".");
    }

    private static String solve(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            for(int i=str.length()-1; i>=0; i--){
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
