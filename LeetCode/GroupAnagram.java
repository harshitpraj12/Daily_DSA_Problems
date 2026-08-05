package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = solve(str);
        for(List<String> s : ans){
            System.out.println(s);
        }
    }

    private static List<List<String>> solve(String[] str) {
        if(str==null || str.length==0){
            return new ArrayList<>();
        }
        Map<String, List<String>> ans = new HashMap<>();
        for(String s : str){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            ans.putIfAbsent(sorted, new ArrayList<>());
            ans.get(sorted).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
