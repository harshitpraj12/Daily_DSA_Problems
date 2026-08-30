package LeetCode;

import java.util.HashMap;

public class RansomeNote {
    public static void main(String[] args) {
        String ransom = "aab";
        String note = "baa";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : note.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : ransom.toCharArray()){
            if(map.containsKey(c)){
                int a = map.get(c);
                if(a>1){
                    map.put(c, map.getOrDefault(c, 0)-1);
                }else{
                    map.remove(c);
                }
            }else{
                System.out.println("False");
            }
        }
        System.out.println("True");
    }
}
