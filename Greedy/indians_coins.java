import java.util.*;

public class indians_coins {
    
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amt = 1059;
        int count = 0;
        
        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    count++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }

        System.out.println("Total(min) coins used : " + count);

        for(int i = 0; i<ans.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
        System.out.println();
    }
}
