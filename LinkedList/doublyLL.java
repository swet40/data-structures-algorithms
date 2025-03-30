import java.util.concurrent.atomic.DoubleAccumulator;

public class doublyLL {
    public class Node{
        int data;
        doublyLL.Node next;
        doublyLL.Node prev;

        public Node(int data){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public static Node head;
    public static Node tail;
    public int size = 0;

    //add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;


    }

    //print
    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //remove
    public static void main(String[] args) {
        doublyLL dll = new doublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();;
        dll.print();
    }
}
