package com.company.AlgoQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int target = 6;
        for (int i : TwoSum(arr, target))
            System.out.print(i + " ");
    }
    public static int[] TwoSum(int[] nums,int target)
    {
        int[] ans = {-1, -1};
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i=0; i<nums.length; i++)
        {
            if(set.containsKey(target-nums[i]))
            {
                ans[0] = set.get(target-nums[i]);
                ans[1] = i;
                break;
            }
            else set.put(nums[i],i);
        }
        return ans;
    }
}
