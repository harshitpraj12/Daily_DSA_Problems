package LeetCode;

public class ShiftingLetters {
    public static void main(String[] args) {
        String s = "ruu";
        int [] arr = {26,9,17};
        String ans = solve(s, arr);
        System.out.println(ans);
    }

	private static String solve(String s, int[] arr) {
        int n = arr.length;
        int val = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=n-1; i>=0; i--){
            val = (val+arr[i])%26;
            char shift = (char)('a'+(s.charAt(i)-'a'+val)%26);
            sb.append(shift);
        }
        return sb.reverse().toString();
	}
}
