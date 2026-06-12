class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class initializingll {
    public static void main(String[] args) {
        // initializingll l = new initializingll();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b.next);
        System.out.println(c);
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
    }
}
