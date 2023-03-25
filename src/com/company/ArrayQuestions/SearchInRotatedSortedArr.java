package com.company.ArrayQuestions;
import com.company.Algos.BinarySearch;

public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key = 0;
        int minInd = minIndex(arr);
        BinarySearch binxSearch = new BinarySearch();
        int KeyInd = binxSearch.binSearch(arr,key,0,minInd-1) > binxSearch.binSearch(arr,key,minInd,arr.length-1) ? binxSearch.binSearch(arr,key,0,minInd-1):binxSearch.binSearch(arr,key,minInd,arr.length-1);
        System.out.println(KeyInd-1);
    }
    public static int minIndex(int[] nums)
    {
        int l=0, r=nums.length-1;
        int mid=l+r/2;
        while(l<r-1)
        {
            mid = (l+r)/2;
            if(nums[mid] > nums[r]) l = mid;
            else if(nums[mid] < nums[r]) r= mid;
        }
        return nums[l]<nums[r]?l:r;
    }
}
