package com.company.DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
         int[] coins = {2};
         int amount = 3;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        int max = amount+1;
        int dp[] = new int[amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for (int i=0;i<=amount;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i>=coins[j])
                {
                    dp[i] = Math.min(1+dp[i-coins[j]], dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
