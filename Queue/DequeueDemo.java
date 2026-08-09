package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class DequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addFirst(5);
        dq.add(6);
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq.peekFirst());
    }
}
