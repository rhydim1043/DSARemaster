package com.company.ArrayQuestions;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{3,5},{1,4},{0,2},{8,10},{12,16}};
        for (int[] arr:merge(intervals))
        {
            for (int i: arr)
                System.out.printf("%d " , i);
            System.out.println();
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> ansList = new ArrayList<>();
        if(intervals.length<=1) return intervals;
        for (int i=0;i<intervals.length;i++)
        {
            if(ansList.size()==0)
            {
                ansList.add(intervals[i]);
            }
            else
            {
                int[] prevInt = ansList.get(ansList.size()-1);
                if (intervals[i][0] <= prevInt[1]) {
                    int[] arr = {prevInt[0], Math.max(intervals[i][1], prevInt[1])};
                    ansList.remove(ansList.size()-1);
                    ansList.add(arr);
                }
                else ansList.add(intervals[i]);

            }
        }
        return ansList.toArray(new int[ansList.size()][]);
    }
}
