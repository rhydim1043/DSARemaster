package com.company.RecursionQuestions;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcde", str2 = "aid";
        System.out.println(lcsLen(str1,str2,0,0));
    }
    public static int lcsLen(String str1, String str2, int i,int j)
    {
        if(i>=str1.length() || j>=str2.length()) return 0;
        if(str1.charAt(i) == str2.charAt(j)) return 1+lcsLen(str1,str2,i+1,j+1);
        return Math.max(lcsLen(str1,str2,i+1,j), lcsLen(str1,str2,i,j+1));
    }
}
