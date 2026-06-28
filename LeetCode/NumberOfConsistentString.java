package LeetCode;

import java.util.HashSet;

public class NumberOfConsistentString {
    public static void main(String[] args) {
        String w = "abc";
        String [] str = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(solve(w, str));
    }

    private static int solve(String w, String[] str) {
        HashSet<Character> set = new HashSet<>();
        for(char c : w.toCharArray()){
            set.add(c);
        }
        int ans = 0;
        for(int i=0; i<str.length; i++){
            boolean avl = true;
            for(char ch : str[i].toCharArray()){
                if(!set.contains(ch)){
                    avl= false;
                }
            }
            if(avl) ans++;
        }
        return ans;
    }
}
