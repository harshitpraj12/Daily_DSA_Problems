package DoublyLinkedList;
class DLL{
    Node head = null;
    Node tail = null;
    int size;
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = head;
            head.pre = tail;
            head = temp;
        }
        size++;
    }
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(head == null ) head = tail = temp;
        else{
            tail.next = temp;
            temp.pre = tail;
            tail = temp;
        }
        size++;
    }
    public void deleteTail() {
        if(head == null) System.out.println("List is empty");
        if(head == tail) head = tail = null;
        else{
            tail = tail.pre;
            tail.next = null;
        }
        size--;
    }
    public void deleteHead() {
        if(head==null) System.out.println("List is empty");
        if(head == tail) head = tail = null;
        else{
            head = head.next;
            head.pre = null;
        }
        size--;
    }

}
public class ImplementaionDLL {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addAtHead(10);
        dll.addAtTail(20);
        dll.addAtTail(30);
        dll.addAtTail(40);
        dll.deleteTail();
        dll.deleteHead();
    }
}
