package Stack;

class StackDemo{
    Node head = null;
    Node tail = null;
    int size=0;
    int peek(){
        if(head==null) return -1;
        return head.val;
    }
    int push(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        temp.next = head;
        head = temp;
        size++;
        return temp.val;
    }
    int pop(){
        if(head == null) return -1;
        int a = head.val;
        head = head.next;
        size--;
        return a;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("size is "+s.size);
        s.display();
    }
}
