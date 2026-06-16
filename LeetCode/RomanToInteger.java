package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "LVIII";
        // String str = "MCMXCIV";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
//         Symbol       Value
//          I             1
//          V             5
//          X             10
//          L             50
//          C             100
//          D             500
//          M             1000
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0;
        int n = str.length();
        for(int i=0; i<str.length(); i++){
            int currentVal = map.get(str.charAt(i));
            
            if (i + 1 < n && currentVal < map.get(str.charAt(i + 1))) {
                ans -= currentVal;
            } else {
                ans += currentVal;
            }
        }
        return ans;
    }
}
