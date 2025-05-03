package BST;
import java.util.*;

public class basic {
    public static class Node {
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        } 

        if(root.data > val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }


    //T.C = O(n)
    public static boolean search(Node root, int key){
        if(root == null) return false;

        if(root.data == key) return true;

        if(root.data < key){
            return search(root.right,key);
        }
        else{
            return search(root.left, key);
        }
    }

    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        if(search(root, 1)){
            System.out.println("found");
        } else{
            System.out.println("not found");
        }

        inOrder(root);
        search(root, 1);
    }
}
