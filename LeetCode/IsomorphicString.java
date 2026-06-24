package LeetCode;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        if(solve(s, t)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }else if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))==t.charAt(i)){
                    continue;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
