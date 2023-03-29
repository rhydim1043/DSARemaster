package com.company.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        for(List<Integer> arr: permute(nums))
        {
            for (int i: arr)
                System.out.print(i+" ");
            System.out.println();
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        help(nums, ansList, new ArrayList<>(),new boolean[nums.length]);
        return ansList;
    }
    public static void help(int[] nums, List<List<Integer>> ansList, List<Integer> list, boolean[] used)
    {
       if(list.size()==nums.length)
       {
           ansList.add(new ArrayList<>(list));
           return ;
       }
       for (int i=0;i<nums.length;i++)
       {
           if(!used[i])
           {
               list.add(nums[i]);
               used[i] = true;
               help(nums,ansList,list,used);
               list.remove(list.size()-1);
               used[i] = false;
           }
       }
    }
}
