package LeetCode;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String j = "z";
        String s = "aAAbbbbaa";
        System.out.println(solve(j, s));
    }

    private static int solve(String j, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int ans = 0;
        for(char ch : j.toCharArray()){
            if(map.containsKey(ch)){
                ans+=map.get(ch);
            }
        }
        return ans;
    }
}
