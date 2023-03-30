package com.company.ArrayQuestions;

public class SortColors {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        for (int i:nums)
            System.out.printf("%d ",i);
    }
    public static void sortColors(int[] nums) {
        int l=0,i=0,r=nums.length-1;
        while(i<=r)
        {
            if(nums[i]==0)
                swap(nums,i,l++);
            else if(nums[i]==2)
                swap(nums,i--,r--);
            i++;
        }
    }
    public static void swap(int nums[], int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
