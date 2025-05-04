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

    public static Node delete(Node root, int val){
        if(root == null) return null;

        if(root.data < val){
            root.right = delete(root.right, val);
        } 
        else if(root.data > val){
            root.left = delete(root.left, val);
        } 
        else{
              //no children
            if(root.left == null && root.right == null){
                return null;
            }

            //single children
            if(root.left == null) return root.right;

            if(root.right == null) return root.left;

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null) return;
        if(root.data>=k1 && root.data <=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        // if(search(root, 1)){
        //     System.out.println("found");
        // } else{
        //     System.out.println("not found");
        // }

        inOrder(root);
        System.out.println();
        // root = delete(root, 1);
        // inOrder(root);

        printInRange(root, 5, 12);

    }
}
