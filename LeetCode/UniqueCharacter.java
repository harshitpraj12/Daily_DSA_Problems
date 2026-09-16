package LeetCode;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int ans = solve(s);
        System.out.println(ans);
    }

    private static int solve(String s) {
        int [] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
