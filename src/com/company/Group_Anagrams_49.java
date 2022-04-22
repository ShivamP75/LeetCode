package com.company;

import javax.swing.*;
import java.util.*;

public class Group_Anagrams_49 {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
    public static List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> list = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0;i<str.length;i++){
            char[] c = str[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(map.containsKey(s)){
                List<String> l = map.get(s);
                l.add(str[i]);
                map.put(s, l);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(str[i]);
                map.put(s, l);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }
}
