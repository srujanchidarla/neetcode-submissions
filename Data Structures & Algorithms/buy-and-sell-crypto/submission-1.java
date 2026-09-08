class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            } 
            int dayProfit = prices[i] - min; 
            if(dayProfit > profit){
                profit = dayProfit;
            }
                      
        }
           System.out.println("min "+ min);
           System.out.println("profit "+ profit);
        return profit;
    }
}
