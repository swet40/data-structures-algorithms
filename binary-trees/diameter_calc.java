import java.util.*;;

public class diameter_calc {

    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
    }
    }

    // public static int height(Node root){
    //     if(root == null){
    //         return 0;
    //     } 
    //     int lh = height(root.left);
    //     int rh = height(root.right);

    //     return Math.max(lh, rh) + 1;
    // }

    // public static int diameter(Node root){
    //     if(root == null) return 0;

    //     int leftDiam = diameter(root.left);
    //     int leftHt = height(root.left);
    //     int rightDiam = diameter(root.right);
    //     int rightHt = height(root.right);
    // }
    
    // Approach-1 --> O(n^2) = T.C.
    // public static int diameter2(Node root) {
    //     if(root == null) return 0;

    //     int leftHt = height(root.left);
    //     int leftDiam = diameter2(root.left);
    //     int rightHt = height(root.right);
    //     int rightDiam = diameter2(root.right);

    //     int selfDiam = leftHt + rightHt+1;
    //     return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

    // }
    // static class Info{
    //     int diam;
    //     int ht;

    //     public Info(int diam, int ht){
    //         this.diam = diam;
    //         this.ht = ht;
    //     }
    // }

    // public static Info diameter(Node root) {
    //     if(root == null) {
    //         return new Info(0, 0);
    //     }
    //     Info leftInfo = diameter(root.left);
    //     Info rightInfo = diameter(root.right);

    //     int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht+1);
    //     int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

    //     return new Info(diam, ht);
    // }

    // public static boolean isIdentical(Node node, Node subRoot) {
    //     if(node == null && subRoot == null) {
    //         return true;
    //     } else if(node == null || subRoot == null || node.data != subRoot.data ) {
    //         return false;
    //     }

    //     if(!isIdentical(node.left, subRoot.left)) {
    //         return false;
    //     }
    //     if(!isIdentical(node.right, subRoot.right)) {
    //         return false;
    //     }
    //     return true;
    // }

    // public static boolean isSubTree(Node root, Node subRoot){
    //     if(root == null){
    //         return false;
    //     }

    //     if(root.data == subRoot.data){
    //         if(isIdentical(root,subRoot)){
    //             return true;
    //         }
    //     }

    //     return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    // }

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else{
                    q.add(null);
                }
            } else{
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
    
                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
    
                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }

            
        }

        for(int i=min; i<=max; i++){
            System.out.println(map.get(i).data + " ");
        }
    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(diameter(root).ht);
        // System.out.println(isSubTree(root, subRoot));
        topView(root);

    }
}
