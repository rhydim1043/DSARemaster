package com.company.DynamicProgramming;

public class FibbonachiSeries {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int n)
    {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(i<=1) dp[i]=i;
            else dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
