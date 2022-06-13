package com.company;

public class Triangle_120 {
    public static void main(String[] args) {
        int[][] triangle = {{2}, {3,4},{6,5,7},{4,1,8,3}};
        System.out.println(minimumTotal(triangle));

    }
    static Integer[][] memo;
    public static int minimumTotal(int[][] triangle) {
        memo = new Integer[triangle.length][triangle.length];
        return dfs(0, 0, triangle);
    }

    private static int dfs(int level, int index, int[][] triangle) {
        if(memo[level][index] != null) return memo[level][index];
        int path = triangle[level][index];
        if(level < triangle.length-1){
            path += Math.min(dfs(level+1, index, triangle), dfs(level + 1, index+1, triangle));
        }
        return memo[level][index] = path;
    }
}
