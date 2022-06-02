package com.company;

public class Unique_Paths2_63 {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{1, 0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    if (obstacleGrid[i][j] == 1)
                        dp[i][j] = 0;
                    else if (dp[i][j - 1] == 0) {
                        dp[i][j] = 0;
                    } else
                        dp[i][j] = 1;
                } else if (j == 0) {
                    if (obstacleGrid[i][j] == 1)
                        dp[i][j] = 0;
                    else if (dp[i - 1][j] == 0) {
                        dp[i][j] = 0;
                    } else
                        dp[i][j] = 1;
                } else if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }

            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
//        int[][] dp = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//
//                if(i == 0 || j == 0){
//                    dp[i][j] = 0;
//                }
////                else if(obstacleGrid[i-1][j-1]==1){
////                    dp[i][j] = 0;
////                }
//                else if(i == 1 || j == 1){
//                    dp[i][j] = (obstacleGrid[i-1][j-1] == 0) ? 1 : 0;
//                }
//
//                else{
//                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
//                }
//            }
//        }
//        return dp[obstacleGrid.length][obstacleGrid[0].length];
//    }
//}
