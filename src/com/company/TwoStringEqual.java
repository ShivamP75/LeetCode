//package com.company;
//
//import java.util.Arrays;
//
//public class TwoStringEqual {
//    public static void main(String[] args) {
////        String[] word1 = {"ab", "c"};
////        String[] word2 = {"a", "bc"};
////        System.out.println(arrayStringsAreEqual(word1, word2));
////        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
////        System.out.println(mostWordsFound(sentences));
//        String address = "1.1.1.1";
//        System.out.println(defangIPaddr(address));
//    }
//
//    public static String defangIPaddr(String address) {
//
//    }
//
//    public static int mostWordsFound(String[] sentences) {
//        int max = 0;
//        for(String s: sentences){
//            String[] s1 = s.split(" ");
//            if(s1.length > max) max = s1.length;
//        }
//        return max;
//    }
//
//    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        StringBuffer sb = new StringBuffer();
//        for (String s: word1) {
//            sb.append(s);
//        }
//        String s1 = sb.toString();
//        StringBuffer sb1 = new StringBuffer();
//        for (String s: word2) {
//            sb1.append(s);
//        }
//        String s2 = sb1.toString();
//        if(s1.equals(s2)) return true;
//        return false;
//    }
//}
