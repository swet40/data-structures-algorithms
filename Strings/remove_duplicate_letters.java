import java.util.*;

public class remove_duplicate_letters{

    public static String remove(String str){
        TreeSet<Character> set = new TreeSet<>();

        for(char ch : str.toCharArray()){
            set.add(ch);
        }

        StringBuilder s = new StringBuilder();
        for(char ch : set){
            s.append(ch);
        }
        return s.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(remove(str));

        sc.close();

        
    }
}