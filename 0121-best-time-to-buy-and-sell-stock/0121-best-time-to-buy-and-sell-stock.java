class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        int sell=0;
        for(int i=1 ;i<prices.length;i++){
            sell=prices[i];
            buy=Math.min(buy,prices[i-1]);
            profit=Math.max(profit,sell-buy);
            if(profit<=0) profit=0;
        }
        return profit;
    }
}