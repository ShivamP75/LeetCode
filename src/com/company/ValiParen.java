package com.company;

import java.util.Stack;

public class ValiParen {

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }


    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.isEmpty()) return false;
                if(st.peek() != '(') return false;
                st.pop();
            }
            else if(ch == ']'){
                if(st.isEmpty()) return false;
                if(st.peek() != '[') return false;
                st.pop();
            }else{
                if(st.isEmpty()) return false;
                if(st.peek() != '{') return false;
                st.pop();
            }

        }
        if(st.isEmpty()) return true;
        return false;
    }
}
