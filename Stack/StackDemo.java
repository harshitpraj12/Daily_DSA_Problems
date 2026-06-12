package Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(2, 20);
        System.out.println(s);
        System.out.println(s.capacity());
        insertAtBottom(50, s);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }

    private static void reverse(Stack<Integer> s) {
        if(s.size()==1){
            return;
        }
        int a = s.pop();
        reverse(s);
        insertAtBottom(a, s);
    }

    private static void insertAtBottom(int i, Stack<Integer> s) {
        if(s.size()==0){
            s.push(i);
            return;
        }
        int a = s.pop();
        insertAtBottom(i, s);
        s.push(a);
    }
}
