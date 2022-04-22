package com.company;


import java.util.Arrays;

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences_1941 {
    public static void main(String[] args) {
        String s =  "abccbaa";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        int count = freq[s.charAt(0) - 'a'];
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] != 0 && freq[i] != count){
                return false;
            }
        }
        return true;
    }

}
