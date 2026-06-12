import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        pq.add(40);
        pq.add(20);
        pq.add(30);
        pq.add(10);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Head element: " + pq.peek()); // Smallest element

        System.out.println("Polling elements in priority order:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
