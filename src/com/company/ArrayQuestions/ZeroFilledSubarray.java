package com.company.ArrayQuestions;

public class ZeroFilledSubarray {
    public static void main(String[] args) {
        int arr[] = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(arr));
    }

    public static long zeroFilledSubarray(int[] nums) {
        long sum=0, n=0;
        int i=0;
        while(i < nums.length)
        {
            if(nums[i]==0) n++;
            else
            {
                sum = sum + (n*(1+n)/2);
                n=0;
            }
            i++;
        }
        sum = sum + (n*(1+n)/2);
        return sum;
    }
}
