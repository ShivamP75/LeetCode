package com.company;

public class Count_and_Say_38 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        return say( n, 1, "1");
    }

    public static String say(int n , int i , String ans){
        if(n == i){
            return ans;
        }
        return say(n, i+1, count(ans));
    }

    public static String count(String ans){
        StringBuilder s = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < ans.length()){
            int count = 0;
            while(j < ans.length() && ans.charAt(i) == ans.charAt(j)){
                count++;
                j++;
            }
            s.append(String.valueOf(count) + ans.charAt(i));
            i = j;
        }
        return String.valueOf(s);
    }
}
