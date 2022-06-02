package com.company;

import java.util.Arrays;

public class Coin_Change_322 {
    public static void main(String[] args) {
        int amount = 10;
        int[] coins = {2,3,5};
        //[186,419,83,408]
        //6249
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        System.out.println(coinChange(coins, amount, dp));
        System.out.println(Arrays.toString(dp));
    }
    public static int coinChange(int[] coins, int amount, int[] dp) {
        return coin(coins, amount, dp);
    }
    public static int coin(int[] coins, int amount, int[] dp){
        if(amount == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<coins.length;i++){
            if(amount - coins[i] >=0){
                int subAns;
                if(dp[amount - coins[i]] != -1){
                    subAns = dp[amount - coins[i]];
                }
                else subAns = coin(coins , amount - coins[i], dp); //0

                ans = (subAns != -1) ? Math.min(ans, subAns + 1) : Math.min(ans, subAns);
                dp[amount] = ans;
            }
            
        }
        return dp[amount] = ans;
    }
}


