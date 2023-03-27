package com.company.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int target = 7;
        for (List<Integer> nums: combinationSum(arr,target))
        {
            for (int i: nums)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return help(candidates,target,0,new ArrayList<>(), new ArrayList<>());
    }
    public static List<List<Integer>> help(int[] arr, int target, int n, List<Integer> list, List<List<Integer>> ansLiist)
    {
        if(n>=arr.length) return ansLiist;
        if(target==0)
        {
            ansLiist.add(new ArrayList<>(list));
            return ansLiist;
        }
        if(arr[n]<=target)
        {
            list.add(arr[n]);
            help(arr,target-arr[n],n,list,ansLiist);

            // The following step removes the unwanted last integer inserted due to line 30,
            // we know that it is unwanted because a desired integer would have returned the
            // target 0 and would have gotten returned before this step
            list.remove(list.size()-1);
        }
        return help(arr,target,n+1,list,ansLiist);
    }
}
