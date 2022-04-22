package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sorting_the_Sentence_1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            int num = Integer.valueOf(str[i].charAt(str[i].length()-1));
            map.put(num, str[i].substring(0,str[i].length()-1));
        }
        int[] arr = new int[map.size()];
        int i = 0;
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            arr[i++] = entry.getKey();
        }
        Arrays.sort(arr);
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            res.append(map.get(arr[j]) + " ");
        }
        return String.valueOf(res);
    }
}
