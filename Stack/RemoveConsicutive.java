package Stack;

import java.util.Stack;

public class RemoveConsicutive {
    public static void main(String[] args) {
        String s = "aaaaaaaabbbbcccaaaaaaaaffff";
        String ans = removeConsecutiveCharacter(s);
        System.out.println("Ans is : "+ans);

    }
    public static String removeConsecutiveCharacter(String s) {
        if (s == null || s.isEmpty()) return "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            // Only push if the stack is empty OR 
            // the current char is different from the top of the stack
            if (stack.isEmpty() || stack.peek() != current) {
                stack.push(current);
            }
        }

        // Build the string from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Since Stack is LIFO, the string is backwards. Reverse it!
        return sb.reverse().toString();
    }
}
