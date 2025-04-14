package assignment;

//T.C = O(n)
//S.C = O(n)
import java.util.*;

public class binary_Print {

    public static void generateArray(int n){
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for(int i = 1; i<=n; i++){
            String current = q.poll();
            System.out.print(current + " ");
            q.add(current + "0");
            q.add(current + "1");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int n = 5;
        generateArray(n);
    }
}
