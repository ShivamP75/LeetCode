package com.company;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(longSubString(s));
    }

    private static int longSubString(String s) {
        if(s.length() <=1) return s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLength = Integer.MIN_VALUE;
        int startWin = 0;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                i++;
                maxLength = Math.max(set.size(), maxLength);
            }
            else{
                set.remove(s.charAt(startWin));
                startWin++;
            }
        }
        return maxLength;
    }
}
