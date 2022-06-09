package com.company;

import java.util.Locale;

public class Longest_Palindromic_Subsequence_516 {
    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }

    public static int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            sb.append(c);
        }
        sb.reverse();
        String s2 = String.valueOf(sb);

        return LPS(s, s2);
    }

    private static int LPS(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp.length;j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}
