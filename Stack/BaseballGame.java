package Stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String [] str = {"5","-2","4","C","D","9","+","+"};
        int ans = calPoints(str);
        System.out.println("Ans "+ ans);
        // 5 -2 -4 9 5 14
    }

    private static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String operation: operations){
            if(operation != "C" && operation != "D" && operation != "+"){
                int a = Integer.parseInt(operation);
                st.add(a);
            }else if (operation.equals("C")) {
                st.pop();
            }else if (operation.equals("D")) {
                int a = st.peek();
                st.push(2*a);
            }else if (operation.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                int c = a+b;
                st.push(b);
                st.push(a);
                st.push(c);
                System.out.println(a+" "+b+" "+ c);
            }   
        }
        int result = 0;
        while(st.size()!=0){
            result+=st.pop();
        }
        return result;
    }
}
