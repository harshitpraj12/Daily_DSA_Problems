package GFG;

import java.util.HashMap;

public class LongestSubstringWithKUnits {
    public static void main(String[] args) {
        String s = "aabaabaa";
        int k = 3;
       
        int ans = subString(s, k);
        System.out.println("Answer is : "+ans);
    }

    private static int subString(String s, int k) {
        char [] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int l = 0;
        for(char a=0; a<arr.length; a++){
            map.put(arr[a], map.getOrDefault(arr[a], 0)+1);
            while(map.size()>k){
                map.put(arr[l], map.getOrDefault(arr[l], 0)-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;
            }
            max = Math.max(max, a-l+1);
        }
        if(map.size()<k){
            return -1;
        }else{
            return max;
        }
    }
}
