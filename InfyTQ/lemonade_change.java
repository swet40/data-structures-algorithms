import java.util.Arrays;

public class lemonade_change{
    public static boolean lemonadeChange(int[] bills) {
        int amtCollected = 0;
        int earn = 0;
        int change = 0;

        // Arrays.sort(bills);
        for(int i = 0; i<bills.length; i++){
            if(bills[i] > 5){
                // earn += bills[i];
                amtCollected += bills[i];
                change = amtCollected - 5;
                earn = amtCollected - change;
                
                if(earn >= change){
                    earn -= change;
                    return true;
                }
                System.out.println("Change = "+change);
            }else{
                amtCollected += bills[i];
                earn+= bills[i];
            }
            System.out.println("Earned :" + earn);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] bills = { 5,5,10,10,20 };
        System.out.println(lemonadeChange(bills));;
    }

}   