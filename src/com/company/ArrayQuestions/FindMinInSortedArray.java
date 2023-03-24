package com.company.ArrayQuestions;

public class FindMinInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,4};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int l=0, r=nums.length-1;
        int mid=l+r/2;
        while(l<r-1)
        {
            mid = (l+r)/2;
            if(nums[mid] > nums[r]) l = mid;
            else if(nums[mid] < nums[r]) r= mid;
        }
        return Math.min(nums[l],nums[r]);
    }
}
