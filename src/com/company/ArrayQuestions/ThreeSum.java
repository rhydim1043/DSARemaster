package com.company.ArrayQuestions;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0};
        for (List i: ThreeSum(arr))
            System.out.println(i);
    }
    public static List<List<Integer>> ThreeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        for (int i=0;i<n-1;i++)
        {
            int l=i+1,r=n-1;
            while(l<r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0)
                {
                    List<Integer> tl = new ArrayList<>();
                    tl.add(nums[i]);
                    tl.add(nums[l]);
                    tl.add(nums[r]);
                    list.add(tl);
                    l++;
                    r--;
                }
                else if(sum > 0) r--;
                else l++;
            }

        }
        List<List<Integer>> ans = new ArrayList<>(list);
        return ans;
    }
}
