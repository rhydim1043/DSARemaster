package com.company.ArrayQuestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,2,3,2,1,2,1,1,1};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr){
        int ans=arr[0], c=0;
        for(int i: arr)
        {
            if(c==0) ans=i;
            if(i==ans) c++;
            else c--;
        }
        return ans;
    }
}
