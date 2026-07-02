import javax.swing.tree.TreeNode;

public class basic2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(8);
        root.right = new Node(15);

        Node leftnode = root.left;
        Node rightnode = root.right;

        leftnode.left = new Node(16);
        rightnode.left = new Node(23);
        rightnode.right = new Node(42);

        System.out.println(root.data);
        System.out.println(root.right.left.data);
    }
}
