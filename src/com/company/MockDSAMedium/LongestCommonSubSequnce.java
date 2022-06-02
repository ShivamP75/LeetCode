package com.company.MockDSAMedium;

public class LongestCommonSubSequnce {
    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";


        int[][] dp = new int[s1.length()+1][s2.length()+1];
        String s = "";
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    s += s1.charAt(i-1);
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[s1.length()][s2.length()] + " " + s);
    }
}
