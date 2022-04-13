package com.company;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        res.reverse();
        return String.valueOf(res);
    }
}
