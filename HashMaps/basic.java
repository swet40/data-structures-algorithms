import java.util.*;

public class basic{

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Pakistan", 200);
        hm.put("UK", 500);

        // System.out.println(hm);

        // O(n)    
        // int population = hm.get( "India");
        // System.out.println(population);
        // System.out.println(hm.get("Sri Lanka"));

        // // Contains Key
        // System.out.println(hm.containsKey("UK"));
        // System.out.println(hm.containsKey("Indonasia"));

        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // System.out.println(hm.size());

        //is empty
        // hm.clear();
        // System.out.println(hm);

        // Iterate
        // entrySet - generates key-value pairs
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // for (String k : keys) {
        //     System.out.println("Key = " + k + ", Value = " + hm.get(k));
        // }
        System.out.println(hm.entrySet());
}
}