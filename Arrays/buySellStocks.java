public class buySellStocks {

    public static int BuyandSellStocks(int prices[]){

        int buyPrice = Integer.MAX_VALUE; //initialize with infinity
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyandSellStocks(prices));

    }
}
