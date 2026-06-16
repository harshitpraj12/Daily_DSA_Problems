package LeetCode;

import java.util.List;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "([])";
        if(solve(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.add(s.charAt(i));
            }else{
                if(
                    s.charAt(i)==')' && stack.peek()=='('
                    ||
                    s.charAt(i)=='}' && stack.peek()=='{'
                    ||
                    s.charAt(i)==']' && stack.peek()=='['
                ){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
