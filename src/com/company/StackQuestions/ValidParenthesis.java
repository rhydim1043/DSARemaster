package com.company.StackQuestions;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "{([{}])}";
        System.out.println(valPar(str));
    }
    public static boolean valPar(String str)
    {
        Stack<Character> st = new Stack<>();
        for(Character i: str.toCharArray())
        {
            if(i=='(' || i=='{' || i=='[') st.push(i);
            else
            {
                if(st.empty()) return false;
                else if(i==')' && st.pop()!='(') return false;
                else if(i=='}' && st.pop()!='{') return false;
                else if(i==']' && st.pop()!='[') return false;
            }
        }
        return st.empty();
    }
}
