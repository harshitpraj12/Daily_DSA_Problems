package LeetCode;

import java.util.Stack;

public class RemoveOutermostParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        String ans = solve(s);
        System.out.println(ans.equals("()()()()(())"));
    }

	private static String solve(String s) {
        // Stack<Character> stack = new Stack<>();
        // StringBuilder sb = new StringBuilder();
        // int count = 0;
        // for(char c : s.toCharArray()){
        //     stack.push(c);
        //     if(c=='('){
        //         count++;
        //     }else{
        //         count--;
        //     }
        //     if(count==0){
        //         stack.pop();
        //         while(!stack.isEmpty()){
        //             sb.append(stack.pop());
        //         }
        //         if(!sb.isEmpty()){
        //             int idx = sb.length();
        //             sb.deleteCharAt(idx-1);
        //         }
        //     }
        // }
        // System.out.println(sb.toString());
        // return sb.toString();
        StringBuilder sb = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    sb.append(c);
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
	}
}
