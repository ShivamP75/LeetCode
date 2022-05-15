package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Top_K_Frequent_Words_692 {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(Arrays.toString(frequentWords(words, k)));
    }

    private static String[] frequentWords(String[] words, int k) {
        HashMap<String, Integer> hmap = new HashMap<>();

        for (String s: words){
            if(hmap.containsKey(s)){
                hmap.put(s, hmap.get(s) + 1);
            }
            else{
                hmap.put(s, 1);
            }
        }
        Pair[] arr = new Pair[hmap.size()];
        int i = 0;
        for(Map.Entry<String , Integer> entry: hmap.entrySet()){
            arr[i++] = new Pair(entry.getKey(), entry.getValue());
        }
        Arrays.sort(arr);

        String[] res = new String[k];
        int n = arr.length-1;
        for (int j = 0; j < k; j++) {
            res[j] = arr[n--].s;
        }
        return res;
    }

    static class Pair implements Comparable<Pair> {
        String s;
        int count;

        Pair(String s, int count){
            this.s = s;
            this.count = count;
        }

        @Override
        public int compareTo(Pair o) {
            return this.count - o.count;
        }
    }
}
