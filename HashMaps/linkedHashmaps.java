import java.util.*;

public class linkedHashmaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Inida", 100);
        lhm.put("pakistan", 0);
        lhm.put("nepal",20);

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(10, "India");
        tm.put(4, "USA");
        tm.put(7, " Sri Lanka");

        System.out.println(tm);
        System.out.println(lhm);
    }
}
