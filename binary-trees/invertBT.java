public class invertBT {
    
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node mirror(Node root){
        if(root == null) {
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        //swap
        root.left = right;
        root.right = left;

        return root;

    }

    public static void inOrder(Node root){
        if(root == null) return ;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        
        System.out.println("inorder for input");
        inOrder(root);

        mirror(root);

        System.out.println("\ninorder of mirror image");
        inOrder(root);
    }
}