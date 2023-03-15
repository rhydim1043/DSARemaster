package com.company.RecursionQuestions;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climb(45));
    }
    public static int climb(int n)
    {
        if(n<=2) return n;
        return  climb(n-2) + climb(n-1);
    }
}
