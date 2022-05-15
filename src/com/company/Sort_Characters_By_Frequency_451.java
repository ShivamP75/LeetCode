package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Sort_Characters_By_Frequency_451 {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c: s.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c, hmap.get(c) + 1);
            }
            else{
                hmap.put(c, 1);
            }
        }
        Pair[] arr = new Pair[hmap.size()];
        int j = 0;
        for(Map.Entry<Character, Integer> entry : hmap.entrySet()){
            arr[j++] = new Pair(entry.getValue(), entry.getKey());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(Pair p : arr){
            String newS = "";
            for (int i = 0; i < p.freq; i++) {
                newS += p.c;
            }
            sb.append(newS);
        }
        return String.valueOf(sb);
    }

    static class Pair implements Comparable<Pair> {
        int freq;
        char c;

        Pair(int freq, char c){
            this.freq = freq;
            this.c = c;
        }


        @Override
        public int compareTo(Pair o) {
            return o.freq - this.freq;
        }
    }
}
