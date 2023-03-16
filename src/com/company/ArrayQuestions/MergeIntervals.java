package com.company.ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newinterval = {4,8};
        // merge(intervals,newinterval);
        for (int[] arr:merge(intervals,newinterval))
        {
            for(int i: arr)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals, int[] newinterval)
    {
        List<int[]> list = new ArrayList<>();
        for(int[] arr: intervals)
        {
            if(arr[1] < newinterval[0]) list.add(arr);
            else if(arr[0] > newinterval[1])
            {
                list.add(newinterval);
                newinterval = arr;
            }
            else
            {
                newinterval[0] = Math.min(newinterval[0], arr[0]);
                newinterval[1] = Math.max(newinterval[1], arr[1]);
            }
        }
        list.add(newinterval);
        int[][] ansMat = new int[list.size()][];
        int c=0;
        for (int[] arr: list)
        {
            ansMat[c++] = arr;
        }
        return ansMat;
    }
}
