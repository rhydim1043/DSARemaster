package com.company.StackQuestions;

import java.util.Stack;

public class PostfixEval {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(PostfixEval(tokens));
    }
    public static int PostfixEval(String[] tokens)
    {
        int res = 0;
        String ops = "+/-*";
        Stack<Integer> stack = new Stack<>();
        for(String s: tokens)
        {
            if(ops.contains(s) && !stack.empty())
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                res = eval(num1,num2,s);
                stack.push(res);
            }
            else stack.push(Integer.valueOf(s));
        }
        return stack.pop();
    }
    public static int eval(int num1, int num2, String s)
    {
        if(s.equals("+"))return num2+num1;
        else if(s.equals("-"))return num2-num1;
        else if(s.equals("/"))return num2/num1;
        return num2*num1;
    }
}
