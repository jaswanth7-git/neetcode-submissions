class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0 ; i < prices.length;i++){
            if(i+1 < prices.length && prices[i] < prices[i+1]){
                profit = profit + Math.abs(prices[i] - prices[i+1]);
            }
        }return profit;
    }
}