public class Coin_Change {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 10;

        System.out.println(waysCoinChange(coins, amount));
    }

    private static int waysCoinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {

                    dp[j] +=  dp[j- coins[i]];
            }
        }
        return dp[amount];


    }
}
