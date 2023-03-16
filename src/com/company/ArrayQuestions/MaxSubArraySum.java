package com.company.ArrayQuestions;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr)
    {
        int sum=0 ,max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            sum+=i;
            if(sum>max) max=sum;
            if(sum<1) sum=0;
        }
        return max;
    }
}
