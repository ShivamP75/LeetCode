package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_and_Replace_Pattern_890 {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";

        System.out.println(findAndReplacePattern(words, pattern));
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Character> map2 = new HashMap<>();
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                if(!map1.containsKey(pattern.charAt(j))){
                    map1.put(pattern.charAt(j), words[i].charAt(j));
                }
                if(!map2.containsKey(words[i].charAt(j))){
                    map2.put(words[i].charAt(j), pattern.charAt(j));
                }
                if(map2.get(words[i].charAt(j)) != pattern.charAt(j) || map1.get(pattern.charAt(j)) != words[i].charAt(j)){
                    flag = false;
                }
            }
            if(flag){
                ans.add(words[i]);
            }
        }
        return ans;
    }
}
