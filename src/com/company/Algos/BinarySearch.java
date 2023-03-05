package com.company.Algos;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 80;
        System.out.println(binSearch(arr, target,0, arr.length-1));
    }

    public static int binSearch(int[] nums, int target, int l, int r) {
        int  index = -1;

             while(l <= r)
             {
                 int mid = (l+r)/2;
                  if(target == nums[mid])
                  {
                      index = mid;
                      return ++index;
                  }
                  else if(target < nums[mid])
                      r = mid - 1;
                  else if(target > nums[mid])
                      l = mid + 1;
             }

             return index;
    }
}
