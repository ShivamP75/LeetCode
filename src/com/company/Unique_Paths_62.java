package com.company;

public class Unique_Paths_62 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
//        int[][] matrix = new int[m][n];
        System.out.println(uniqueWays(m, n));
    }

    private static int uniqueWays(int m, int n) {
       int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(i == 1 || j == 1){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
