package Arrays;

public class BestTimeToBuyOrSellStock2 {


    // Say you have an array for which the i-th element is the price of a given stock on day i.
    public static int maxProfit(int[] prices) {
        int result = 0, buy, sell;
        for(int i = 0; i < prices.length-1; i++){
            buy = i;
            sell = i;
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] > prices[sell]) {
                    buy = i;
                    sell = j;
                }
                else if(prices[j] < prices[sell])
                    break;
            }
            result += prices[sell] - prices[buy];
            i = sell;
        }
        return result;
    }


    public static void print(int buy, int sell){
        System.out.println("Buy: " + buy);
        System.out.println("Sell: " + sell);
        System.out.println("-------------");
    }


    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println("1,2,3,4,5");
        System.out.println(maxProfit(prices));
    }

}
