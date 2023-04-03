package com.company.DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        if(n>=1) arr[0]=nums[0];
        if(n>=2) arr[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++)
        {
            arr[i]=Math.max(arr[i-1],nums[i]+arr[i-2]);
        }

        return arr[n-1];

    }

}
