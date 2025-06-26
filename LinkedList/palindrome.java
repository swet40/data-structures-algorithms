import java.util.LinkedList;

public class palindrome{
    
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { //O(n)

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Floyds Cycle finding algorithm
public static boolean isCycle() { 
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast){
            return true;
        }
    }
    return false;
}

//removing a cycle
public static void removeCycle(){
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    //detect cycle
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            cycle = true;
            break;
        }
    }
    if(cycle == false){
        return;
    }

    //find meeting point
    slow = head;
    Node prev = null;
    while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    //remove cycle -> last.next = null
    prev.next = null;
}


public void zigzag(){
    //find mid
    Node slow = head;
    Node fast = head.next;
    while(fast != null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;

    //reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextL, nextR;

    //alt merge - zig-zag merge
    while(next != null && right != null){
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;
    }
}


    public static void main(String[] args) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        //1->2->3->2
        LinkedList ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
        System.out.println(ll);
    }
}