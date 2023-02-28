package com.company.Algos;
import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 50;
        System.out.println(binSearch(arr, target));
    }

    public static int binSearch(int[] nums, int target) {
        int n = nums.length - 1;
        int l = 0, r = n, index = -1;

             while(l <= r)
             {
                 int mid = l+(r-1)/2;
                  if(target == nums[mid])
                  {
                      index = mid;
                      return index;
                  }
                  else if(target < nums[mid])
                      r = mid - 1;
                  else if(target > nums[mid])
                      l = mid + 1;
             }

             return index;
    }
}
