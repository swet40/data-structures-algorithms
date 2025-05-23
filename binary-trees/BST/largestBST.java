public class largestBST {
    
    public static class Node {
        int data;
        Node right,left;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root){
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info LeftInfo = largestBST(root.left);
        Info RightInfo = largestBST(root.right);
        int size = LeftInfo.size + RightInfo.size + 1;
        int min = Math.min(root.data, Math.min(LeftInfo.min, RightInfo.min));
        int max = Math.max(root.data, Math.max(LeftInfo.max, RightInfo.max));

        if(root.data <= LeftInfo.max || root.data >= RightInfo.min){
            return new Info(false, size, min, max);
        }
        if(LeftInfo.isBST && RightInfo.isBST) {
            maxBST= Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = largestBST(root);
        System.out.println("Largest BST Size: " + maxBST);

    }
}