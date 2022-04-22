package com.company;

public class Detect_Capital_520 {
    public static void main(String[] args) {
        String s = "FlaG";
        System.out.println(detectCapitalUse(s));
    }
    public static boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        if(word.charAt(0) >= 97 && word.charAt(0) <= 122){
            for(int i = 1;i<word.length();i++){
                if(word.charAt(i) < 97 || word.charAt(i) > 122){
                    return false;
                }
            }
            return true;
        }
        if(word.charAt(0) >= 65 && word.charAt(0) <= 90){
            if(word.charAt(1) >= 65 && word.charAt(1) <= 90){
                for(int i = 2;i<word.length();i++){
                    if(word.charAt(i) < 65 || word.charAt(i) > 90){
                        return false;
                    }
                }
                return true;
            }
            else if(word.charAt(1) >= 97 && word.charAt(1) <= 122){
                for(int i = 2;i<word.length();i++){
                    if(word.charAt(i) < 97 || word.charAt(i) > 122){
                        return false;
                    }
                }
                return true;
            }

        }
        return false;
    }
}
