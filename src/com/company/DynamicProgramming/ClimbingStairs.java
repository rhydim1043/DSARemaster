package com.company.DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climb(45));
    }
    public static int climb(int n)
    {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            if(i<=2) dp[i]=i;
            else dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
