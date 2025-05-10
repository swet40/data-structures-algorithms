import java.util.*;

public class merge2bst {

    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }

        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static Node createBST(ArrayList<Integer> create, int st, int end){
        if(st > end) {
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(create.get(mid));
        root.left = createBST(create, st, mid-1);
        root.right = createBST(create, mid+1, end);
        return root;

    }

    public static Node mergeBST(Node root1, Node root2){
        //step 1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);

        //step 2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root1, arr2);

        //merge
        int i=0, j = 0;
        ArrayList<Integer> finarArr = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                finarArr.add(arr1.get(i));
                i++;
            } else{
                finarArr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            finarArr.add(arr1.get(i));
                i++;
        }

        while(j<arr2.size()){
            finarArr.add(arr2.size());
            j++;
        }

        // sorted array - merge BSTs
        return createBST(finarArr, 0, finarArr.size() - 1);

    }
    
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);
    }
}
