import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(4);
        set.add(9);
        set.add(1);

        // System.out.println(set);

        // if(set.contains(4)){
        //     System.out.println("Set contains 4");
        // }
        // if(set.contains(0)){
        //     System.out.println("Set contains 0");
        // }
        // if(set.contains(9)){
        //     System.out.println("Set contains 9");
        // }

        System.out.println(set.size());
        // System.out.println(set.isEmpty());
        set.remove(4);
        System.out.println(set);
    }
}
