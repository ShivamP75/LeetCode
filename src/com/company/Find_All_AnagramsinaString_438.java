package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_AnagramsinaString_438 {
    public static void main(String[] args) {
        String s = "cbaebabacd",  p = "abc";
        System.out.println(Arrays.asList(findAnagrams(s, p)));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        p = new String(pArr);
        int n = p.length();
        for (int i = 0; i < s.length()-p.length(); i++) {
            String subS = s.substring(i,n+i);
            char[] sArr = subS.toCharArray();
            Arrays.sort(sArr);
            subS = new String(sArr);
            if(subS.equals(p)){
                list.add(i);
            }
        }
        return list;
    }
}
