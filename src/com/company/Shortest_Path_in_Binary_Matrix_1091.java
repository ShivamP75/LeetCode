package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Path_in_Binary_Matrix_1091 {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1, 0, 0, 0},
                {0, 1, 0, 1, 1, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 0, 0, 1, 1, 0},
                {1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        visited[0][0] = true;
        int step = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                if (curr[0] == grid.length - 1 && curr[1] == grid[0].length - 1) {
                    return step;
                }
                for (int[] dir : directions) {
                    int newX = curr[0] + dir[0];
                    int newY = curr[1] + dir[1];
                    if (isSafe(grid, newX, newY, visited)) {
                        visited[newX][newY] = true;
                        q.add(new int[]{newX, newY});
                    }
                }
            }
            step++;
        }
        return -1;
    }

    private static boolean isSafe(int[][] grid, int newX, int newY, boolean[][] visited) {
        if( newX < 0 || newY < 0 || newX >= grid.length || newY >= grid[newX].length || visited[newX][newY] || grid[newX][newY] == 1){
            return false;
        }
        return true;
    }

}


//        if(grid[0][0] == 1) return -1;
//        int[][] dp = new int[grid.length][grid[0].length];
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                if(i == 0 && j == 0){
//                    dp[i][j] = 1;
//                }
//                else if(i == 0){
//                    if(grid[i][j] == 1){
//                        dp[i][j] = Integer.MAX_VALUE;
//                    }
//                    else if(dp[i][j-1] == Integer.MAX_VALUE){
//                        dp[i][j] = Integer.MAX_VALUE;
//                    }
//                    else{
//                        dp[i][j] = dp[i][j-1] + 1;
//                    }
//                }
//                else if(j == 0){
//                    if(grid[i][j] == 1){
//                        dp[i][j] = Integer.MAX_VALUE;
//                    }
//                    else if(dp[i-1][j] == Integer.MAX_VALUE){
//                        dp[i][j] = Integer.MAX_VALUE;
//                    }
//                    else{
//                        dp[i][j] = dp[i-1][j] + 1;
//                    }
//                }
//                else if(grid[i][j] == 1){
//                    dp[i][j] = Integer.MAX_VALUE;
//                }
//                else{
//                    if(dp[i-1][j-1] == Integer.MAX_VALUE && dp[i][j-1] == Integer.MAX_VALUE && dp[i-1][j] == Integer.MAX_VALUE){
//                        dp[i][j] = Integer.MAX_VALUE;
//                    }
//                    else{
//                        dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
//                    }
//                }
//            }
//        }
//        return dp[dp.length-1][dp[0].length-1] == Integer.MAX_VALUE ? -1 : dp[dp.length-1][dp[0].length-1];
//    }
//}
