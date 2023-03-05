package com.company.ArrayQuestions;

public class EquilibriumPoint {
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,2};
        System.out.println(equilibriumPoint(arr, arr.length));
    }
    public static int equilibriumPoint(long arr[], int n) {
        int l=0, r= n-1, sumLeft =0, sumRight = 0;
        while(l<=r)
        {
            if(sumLeft > sumRight)
            {
                sumRight += arr[r--];
            }
            else if (sumLeft < sumRight)
            {
                sumLeft += arr[l++];
            }
            else if(sumLeft==sumRight && l==r){
                return l+1;
            }
            else{
                sumLeft+=arr[l++];
                sumRight+=arr[r--];
            }
        }
        return -1;
    }
}
