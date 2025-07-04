// Microsoft, Google
//T.C = O(L)   : L ---> longest word in trie

public class prefix_problem{

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
        for(int i = 0; i<26; i++){
            children[i] = null;
        }
    }
}

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
                curr.children[idx].freq = 1;
            } else{
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }


    public static void findPrefix(Node root,String ans){

        if(root == null) return;

        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        
        for(int i = 0; i<root.children.length; i++){
            if(root.children != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static boolean startPrefix(String prefix){
        Node curr = root;

        for(int i = 0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String[] args) {
        String arr[] = {"apple", "app", "man", "mango", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i = 0; i<arr.length; i++){
            insert(arr[i]);
        }

        // root.freq = -1;
        // findPrefix(root, "");

        System.out.println(startPrefix(prefix1));
        System.out.println(startPrefix(prefix2));
    }
}
