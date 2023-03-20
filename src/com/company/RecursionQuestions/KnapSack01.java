package com.company.RecursionQuestions;

public class KnapSack01 {
    public static void main(String[] args) {
        int wt[] = {4,5,6};
        int val[] = {1,2,3};
        int W = 3, n = 3;
        System.out.println(knapSack(W,wt,val,n));
    }
    public static int knapSack(int W, int wt[], int val[], int n)
    {
        if(W == 0 || n==0) return 0;
        if(wt[n-1] <= W)
        return Math.max((val[n-1] + knapSack(W-wt[n-1], wt, val, n-1)), knapSack(W, wt, val, n-1));
        return knapSack(W, wt, val, n-1);
    }
}
