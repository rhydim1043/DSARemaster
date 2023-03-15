package com.company.RecursionQuestions;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(9999));
    }
    public static int digitalRoot(int n)
    {
        if(n%10==n) return n;
        return digitalRoot(n/10 + n%10);
    }
}
