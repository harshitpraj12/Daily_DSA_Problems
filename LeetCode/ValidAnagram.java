package LeetCode;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        if(solve(s, t)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String s, String t) {
        if(s.length()!=t.length()) return false;
        int [] ans = new int[26];
        for(int i=0; i<s.length(); i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++){
            if(ans[i]!=0){
                return false;
            }
        }
        return true;
    }
}
