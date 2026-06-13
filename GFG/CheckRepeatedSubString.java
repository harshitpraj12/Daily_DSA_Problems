package GFG;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckRepeatedSubString {
    public static void main(String[] args) {
        String str = "abcbedabcabc";
        int k = 3;
        if(solve(str, k)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String str, int k) {
        if(str.length()%k!=0) return false;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i+=k){
            String subString = str.substring(i, i+k);
            map.put(subString, map.getOrDefault(subString, 0)+1);
            if(map.size()>2) return false;
        }
        System.out.println(map);
        map.values();
        if(map.size()==1){
            return true;
        }else if(map.size()==2){
            ArrayList<Integer> arr = new ArrayList<>(map.values());
            if(arr.get(0)>1&&arr.get(1)>1) return false;
            else return true;
        }
        return false;
    }
}
