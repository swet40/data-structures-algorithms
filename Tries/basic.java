public class basic{
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for(int i = 0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node(); //by default - root is always empty

    public static void main(String[] args) {
        String word[] = {"the", "a", "there", "their", "any", "thee"};
    }
}