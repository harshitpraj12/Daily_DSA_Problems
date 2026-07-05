package GFG;

import java.util.HashMap;
import java.util.HashSet;

public class MaxGapBetweenTwoSame {
    public static void main(String[] args) {
        String str = "socks";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = -1;
        for(int i=0; i<str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), i);
            }else{
                int preIdx = map.get(str.charAt(i));
                max = Math.max(i-preIdx, max);
            }
        }
        if(max==-1) return -1;
        return max-1;
    }
}
