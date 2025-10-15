import java.util.*;

public class balanced_parenthesis{
    public static void helper(String curr, int o, int c,int n, List<String> res){
        if(o == n && c == n){
            res.add(curr);
            return;
        }
        if(o < n){
            helper(curr + "(" , o+1, c,n, res);
        }
        if(o > c){
            helper(curr+")", o, c+1,n, res);
        }
    }

    public static List<String> generate(int n){
        List<String> res = new ArrayList<>();
        helper("", 0, 0, n, res);
        return res;
    }
    public static void main(String[] args) {
        
        int n = 4;
        System.out.println(generate(n));
    }
}