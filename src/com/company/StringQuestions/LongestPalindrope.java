package com.company.StringQuestions;

public class LongestPalindrope {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        int ans=0;
        for (char ch: s.toCharArray())
            count[ch]++;
        for(int i:count)
        {
            if(i==0) continue;
            ans+=i/2*2;
            if(ans%2==0 && i%2==1) ans++;
        }
        return ans;
    }
}
