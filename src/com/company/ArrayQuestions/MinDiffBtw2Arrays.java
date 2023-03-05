package com.company.ArrayQuestions;

import java.util.Arrays;

public class MinDiffBtw2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 15, 11, 2};
        int[] arr2 = {23, 127, 235, 19, 8};
        int ans[] = MinDiffBtw2Arrays(arr1, arr2);
        System.out.println(ans[0] + " - " + ans[1] + " = " + ans[2]);
    }
    public static int[] MinDiffBtw2Arrays(int[] arr1, int[] arr2)
    {
        int minDiffArr[] = new int[3];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int minDiff = Integer.MAX_VALUE, i=0, j=0;
        while(i<arr1.length && j< arr2.length)
        {
            if(Math.abs(arr1[i] - arr2[j]) < minDiff)
            {
                minDiff = Math.abs(arr1[i] - arr2[j]);
                minDiffArr[0] = arr1[i] > arr2[j] ? arr1[i] : arr2[j];
                minDiffArr[1] = arr1[i] < arr2[j] ? arr1[i] : arr2[j];
                minDiffArr[2] = minDiff;
            }
            if(arr1[i] > arr2[j]) j++;
            else i++;
        }
        return minDiffArr;
    }
}
