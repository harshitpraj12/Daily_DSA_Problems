package LinkedList;

class LinkedListDemo {
    Node head;
    Node tail;
    int size=0;
    public void addAtTail(int val) {
        Node temp = new Node(val);
        if(tail==null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    public void addAtHead(int val) {
        Node temp = new Node(val);
        if(tail==null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        if(head == null) return;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteHead() {
        if(head==null) return;
        head = head.next;
        size--;
    }
    public void deleteTail() {
        Node pre = head;
        Node nex = head;
        while(nex!=null){
            nex = nex.next.next;
            pre = pre.next;
        }
        tail = pre;
        tail.next = null;
        size--;
    }
    public boolean search(int val) {
        if(head==null) return false;
        Node temp = head;
        while(temp!=null){
            if(temp.val==val) return true;
            temp = temp.next;
        }
        return false;
    }
    public void insertAtIdx(int val, int idx) {
        if(idx<=0){
            addAtHead(val);
            return;
        }
        if(idx>=size-1){
            addAtTail(val);
            return;
        }
        Node temp = head;
        Node node = new Node(val);
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public int atIndex(int idx) {
        if(idx==0) return head.val;
        if(idx==size-1) return tail.val;
        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    public void delateIdx(int i) {
        if(i==0){
            deleteHead();
            return;
        }
        if(i==size-1){
            deleteTail();
            return;
        }
        // Node curr = head.next;
        Node pre = head;
        for(int j = 0; j<i-1; j++){
            // curr = curr.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }

    
}
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtHead(1);
        ll.display();
        System.out.println(ll.size);
        ll.display();
        System.out.println(ll.size);
        // System.out.println(ll.search(20));
        ll.insertAtIdx(15, 6);
        ll.display();
        System.out.println(ll.atIndex(3));
        ll.delateIdx(2);
        ll.display();
        System.out.println(ll.size);
    }
}
