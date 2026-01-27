public class rotate_list {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    // public static Node head;

    public static Node rotateList(Node head, int k){
        // base case
        if(head == null || k == 0) return head;

        // length of head
        int len = 1;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
            len ++;
        }

        // if k has a larger value
        k = k%len;
        if(k==0){
            curr.next = null;
            return head;
        }

        // make the list circular
        curr.next = head;

        // iterate to kth value
        curr = head;
        for(int i = 1; i<k; i++){
            curr = curr.next;
        }

        // set new head
        Node newHead = curr.next;

        // break the list; cut at point x
        curr.next = null;

        return newHead;

    }

    static void printlist(Node node){
        while(node != null){
            System.out.print(node.data);
            if(node.next != null){
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = rotateList(head, 6);
        printlist(head);
    }
}
