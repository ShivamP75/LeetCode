package com.company.MockDSAMedium;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "ABC";

        printAll(s,"");
    }

    private static void printAll(String s, String str) {
        if(s.length() == 0){
            System.out.print(str + " ");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            String newS = s.substring(0,i) + s.substring(i+1);

            printAll(newS, str+c);

        }
    }
}
