package BST;
import java.util.*;


public class balanced {
    
    public static class Node {
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null) return;

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static void preorder(Node root, ArrayList<Integer> preOrder){
        if(root == null) return;

        preOrder.get(root.data);
        preorder(root.left, preOrder);
        preorder(root.right, preOrder);

    }

    public static Node create_bst(ArrayList<Integer> inorder, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = create_bst(inorder, st, mid-1);
        root.right = create_bst(inorder, mid+1, end);
        return root;
    }

    public static Node balanceBST(Node root){
        // inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        //sorted inorder - balanced BST
        root = create_bst(inorder, 0,inorder.size()-1);
        return root;

    }

    public static Node createBST(int arr[], int st, int end){
        if(st>end) return null;
        int mid = (st+end)/2;

        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
    }

    public static void main(String[] args) {
        // int arr[] = {3, 5, 6, 8, 10, 11, 12};

        // Node root = createBST(arr, 0, arr.length-1);
        // preOrder(root);
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = balanceBST(root);
        preOrder(root);
    }

}
