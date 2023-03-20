package com.company.ArrayQuestions;

import java.util.Arrays;

public class ProdExceptSelf {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        for(int i : prod(arr))
            System.out.print(i+ " ");
    }
    public static int[] prod(int[] nums)
    {
        int curr = 1, index=0;
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        for (int i: nums)
        {
            ans[index++]*=curr;
            curr*=i;
        }
        curr =1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i] *=curr;
            curr*=nums[i];
        }
        return ans;
    }
}
