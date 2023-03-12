package com.company.ArrayQuestions;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, profit=0;
        for(int i : arr)
        {
            if(min>i) min = i;
            if(max < (i-min)) max = i-min;
        }
        return max;
    }
}
