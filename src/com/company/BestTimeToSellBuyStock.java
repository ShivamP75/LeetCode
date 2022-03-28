package com.company;

public class BestTimeToSellBuyStock {

    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i< prices.length;i++){
            min = Math.min(min, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - min);
        }
        return maxPro;
    }
}
