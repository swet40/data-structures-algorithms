import java.util.*;

public class linked_hashSets {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Bangalore");
        hs.add("NYC");

        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bangalore");
        lhs.add("NYC");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Bangalore");
        ts.add("NYC");

        System.out.println(ts);

    }
}
