package com.company.ArrayQuestions;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        for (List i: ThreeSum(arr))
            System.out.println(i);
    }
    public static List<List<Integer>> ThreeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        return list;
    }
}
