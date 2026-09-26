package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvaluateTheBrakateAndReplaceWithKey {
    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        List<List<String>> know = new ArrayList<>();
        know.add(new ArrayList<>(List.of("name", "bob")));
        know.add(new ArrayList<>(List.of("age", "two")));
        System.out.println(know);
        String ans = solve(s, know);
        System.out.println(ans);
    }

    private static String solve(String s, List<List<String>> know) {
        HashMap<String, String> map = new HashMap<>();
        for(List<String> str : know){
            map.put(str.get(0), str.get(1));
        }
        StringBuilder result = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean inBrack = false;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                inBrack = true;
                key.setLength(0);
            }else if(ch==')'){
                inBrack=false;
                result.append(map.getOrDefault(key.toString(), "?"));
            }else if(inBrack){
                key.append(ch);
            }else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}
