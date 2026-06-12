//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data= data;
//        this.next = null;
//    }
//}
//class LinkedList{
//    static Node head = null;
//    static Node tail = null;
//    public void insertAtEnd(int data){
//        Node temp = new Node(data);
//        if(head == null){
//            head = temp;
//            tail = temp;
//        }else{
//            tail.next = temp;
//            tail = temp;
//        }
//    }
//    public void insertAtBeg(int data){
//        Node temp = new Node(data);
//        if(head == null){
//            head = temp;
//            tail = temp;
//        }else{
//            temp.next = head;
//            head = temp;
//        }
//    }
//    public void insertAtInd(int data, int idx){
//        Node temp = new Node(data);
//        if(idx==0){
//            insertAtBeg(data);
//            return;
//        }
//        if(idx >= length()){
//            insertAtEnd(data);
//            return;
//        }
//        Node pre = head;
//        for(int i = 0; i<idx-1; i++){
//            pre = pre.next;
//        }
//        temp.next = pre.next;
//        pre.next = temp;
//    }
//    public void display(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+" -> ");
//            temp = temp.next;
//        }
//        System.out.print("null");
//        System.out.println();
//    }
//    public int length(){
//        Node temp = head;
//        int count=0;
//        while(temp != null){
//            count++;
//            temp = temp.next;
//        }
//        return count;
//    }
//    public void deletefirst(){
//        Node temp = head;
//        if(head == null) return;
//        head = temp.next;
//    }
//    public void deletelast(){
//        Node temp = head;
//        if(head == null){
//            System.out.println("List is empty");
//            return;
//        }
//        if(head.next == null){
//            head = null;
//            return;
//        }
//        while(temp.next.next!=null){
//            temp = temp.next;
//        }
//        temp.next = null;
//    }
//    public void deleteIdx(int idx){
//        Node temp = head;
//        if(idx==0||idx==1){
//            System.out.println("List is empty");
//            return;
//        }
//        for(int i=0; i<idx-1; i++){
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//    }
//    public void del(int val){
//        Node temp = head;
//        while(temp.data!=val){
//            temp = temp.next;
//        }
//        if(temp.next==null){
//            temp=null;
//            return;
//        }
//        temp.data = temp.next.data;
//        temp.next = temp.next.next;
//    }
//    public int nthNodelast(int idx){
//        Node temp = head;
//        idx = length()-idx;
//        for(int i=0; i<idx; i++){
//            temp=temp.next;
//        }
//        return temp.data;
//    }
//    public int nthNodelast2(int idx){
//        Node slow = head;
//        Node fast = head;
//        for(int i=0; i<idx; i++){
//            fast=fast.next;
//        }
//        while(fast!=null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow.data;
//    }
//    public void delelefromLast(int n){
//        Node slow = head;
//        Node fast = head;
//        for(int i=0; i<n; i++){
//            fast=fast.next;
//        }
//        if(fast==null){
//            head=head.next;
//            return;
//        }
//        while(fast.next!=null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//    }
//}
//public class linkedlist1{
//
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.insertAtEnd(1);
//        ll.insertAtEnd(2);
//        ll.insertAtEnd(3);
//        ll.insertAtBeg(9);
//        ll.insertAtEnd(12);
//        ll.insertAtEnd(4);
//        ll.insertAtInd(10, 2);
//        ll.delelefromLast(7);
//        ll.del(4);
//        ll.deleteIdx(2);
//        ll.deletefirst();
//        ll.deletelast();
//        ll.display();
//        System.out.println("Node value is: "+ ll.nthNodelast(1));
//        System.out.println("Node value is: "+ ll.nthNodelast2(4));
//        System.out.println("Length of Linked List is : "+ ll.length());
//    }
//}
