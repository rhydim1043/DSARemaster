package com.company.ArrayQuestions;

public class TwoSumII {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,9,56,90};
        int target = 8;
        for(int i: TwoSum(arr,target))
            System.out.print(i + " ");
    }
    public static int[] TwoSum(int[] nums, int target)
    {
        int l = 0, r = nums.length - 1;

        while (nums[l] + nums[r] != target) {
            if (nums[l] + nums[r] < target) l++;
            else r--;
        }

        return new int[] {l+1, r+1};
    }
}
