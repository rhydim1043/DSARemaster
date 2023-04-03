package com.company.RecursionQuestions;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rob(arr, arr.length-1));
    }
    public static int rob(int[] nums, int n) {
          if(n<0) return 0;
          return Math.max(rob(nums,n-1), rob(nums,n-2)+nums[n]);
    }
}
