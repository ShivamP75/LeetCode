package com.company;

import java.util.Stack;

public class Valid_Parenthesis_String_678 {
    public static void main(String[] args) {
        String s = "(*)";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String str) {
        int low= 0;
        int high = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == '('){
                low++;
                high++;
            }
            else if(c == '*'){
                low--;
                high++;
            }
            else{
                low--;
                high--;
                if(high < 0) break;
            }
            if(low < 0) low = 0;
        }
        return low == 0;
    }
}
