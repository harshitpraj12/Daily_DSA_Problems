package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MinimumNumberOfKeysStroke {
    public static void main(String[] args) {
        String s = "aabbccddeeffgghhiiiiii";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Integer> arr = new ArrayList<>(map.values());
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
        int press = 0;
        for(int i=0; i<arr.size(); i++){
            int mul = i/8+1;
            press+=arr.get(i)*mul;
        }
        System.out.println(press);
    }
}
