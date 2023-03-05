package com.company.ArrayQuestions;

public class MoveElementToEnd {
    public static void main(String[] args) {
        int[] arr = {0};
        int key = 0;
        for(int i: MoveElementToEnd(arr, key)) System.out.print(i + " ");
    }
    public static int[] MoveElementToEnd(int[] arr, int key)
    {
        int index = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=key)
            {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index++] = temp;
            }
        }
        return arr;
    }
}
