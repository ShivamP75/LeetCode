package com.company;

import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        String s = "/../";
        System.out.println(simplifyPath(s));
    }
    public static String simplifyPath(String path) {
        Stack<Character> s = new Stack<>();
        s.push(path.charAt(0));
        for(int i = 1 ;i<path.length();i++){
            char c = path.charAt(i);
            if(c == '/'){
                if(s.peek() == c){
                    continue;
                }
                else s.push(c);
            }
            else if(c =='.'){
                if(s.peek() == '.'){
                    while(s.peek() != '/'){
                        s.pop();
                    }
                }
               else s.push(c);
            }
            else{
                s.push(c);
            }
        }
        s.pop();
        if(s.isEmpty()) s.push('/');
        StringBuilder str = new StringBuilder();
        while(!s.isEmpty()){
            str.append(s.pop());
        }
        str.reverse();
        return String.valueOf(str);
    }
}
