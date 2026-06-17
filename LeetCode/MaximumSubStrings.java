package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubStrings {
    public static void main(String[] args) {
        String s = "abcd";
        int a = solve(s);
        System.out.println(a);
    }

    private static int solve(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}
