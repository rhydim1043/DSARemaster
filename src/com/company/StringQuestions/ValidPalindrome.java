package com.company.StringQuestions;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = ".,";
        //System.out.println((int)' ');
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str)
    {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        str.toCharArray();
        int i =0, j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
