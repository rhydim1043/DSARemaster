package com.company.ArrayQuestions;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int arr[] = {0};
        int n = 1;
        System.out.println(canPlaceFlowers(arr,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        for (int i=0;i<size;i++)
        {
            if(flowerbed[i]==0)
            {
                if((i-1>=0 && flowerbed[i-1]!=1) || i-1<0)
                {
                    if((i+1<size && flowerbed[i+1]!=1) || i+1==size)
                    {
                        flowerbed[i] = 1;
                        n--;
                    }
                }
            }
        }
        return n<=0;
    }
}
