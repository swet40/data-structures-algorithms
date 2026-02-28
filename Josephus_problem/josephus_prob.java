import java.util.ArrayList;
import java.util.List;

public class josephus_prob{
    public static int josephus(int n, int k){
        int survior = 0; // 0-indexed

        //entire process starts at 1
        for(int i = 1; i<=n; i++){
            survior = (survior + k)%i;
        }
        return survior+1;
    }

    public static List<Integer> last2survivor(int n, int k){

        // Time complexity = O(n^2)
        // space complexity = O(n)

        List<Integer> people = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            people.add(i);
        }
        int index = 0;
        while(people.size() > 2){
            index = (index + k - 1)%people.size();
            people.remove(index);
        }
        return people;
    }
    
    public static int[] last2(int n, int k){
        // T.c = O(n)
        // S.C = O(1)
        
        int first = 0;
        int second = 1;
        for(int i = 3; i<=n; i++){
            first = (first + k)%i;
            second = (second + k) %i;
        }
        return new int[]{first+1, second+1};
    }


    public static void main(String[] args) {
        int n = 41;
        int k = 3;

        int[] ans = last2(n, k);
        System.out.println(ans[0] + " " + ans[1]);

    }
}