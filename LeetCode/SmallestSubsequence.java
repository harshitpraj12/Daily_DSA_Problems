package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class SmallestSubsequence {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        String ans = solve(s);
        System.out.println(ans);
    }

    private static String solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), i);
        }
        Stack<Character> stack = new Stack<>();
        boolean [] visited = new boolean[26];
        for(int i=0; i<s.length(); i++){
            if(visited[s.charAt(i)-'a']) continue;
            while(!stack.empty() && stack.peek()>s.charAt(i) && map.get(stack.peek())>i){
                visited[stack.peek()-'a']=false;
                stack.pop();
            }
            stack.push(s.charAt(i));
            visited[s.charAt(i)-'a']=true;
        }
        StringBuilder st = new StringBuilder();
        while(!stack.empty()){
            st.append(stack.pop());
        }
        return st.reverse().toString();
    }
}
