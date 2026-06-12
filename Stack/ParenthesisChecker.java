package Stack;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "[{()}]";
        if(solve(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private static boolean solve(String s) {

        char [] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : arr){
            if(c=='[' || c=='{' || c=='('){
                stack.push(c);
            }else{
                if(stack.size()==0) return false;
                char top = stack.peek();
                if(sameStyle(c, top)) stack.pop();
                else return false;
            }
        }
        return (stack.size()==0);
    }

    private static boolean sameStyle(char b, char a) {
        if(a=='(' && b==')') return true;
        if(a=='[' && b==']') return true;
        if(a=='{' && b=='}') return true;
        return false;
    }
}
