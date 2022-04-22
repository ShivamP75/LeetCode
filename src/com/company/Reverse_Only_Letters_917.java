package com.company;

public class Reverse_Only_Letters_917 {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        StringBuilder str = new StringBuilder();
        String newS = "";
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if((c >= 65 && c <=90) || (c>=97 && c <= 122)){
                newS += c;
            }
        }
        System.out.println(newS);
        int j = newS.length()-1;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if((c >= 65 && c <=90) || (c>=97 && c <= 122)){
                str.append(newS.charAt(j--));

            }
            else{
                str.append(c);
            }
        }
        return String.valueOf(str);
    }
}
