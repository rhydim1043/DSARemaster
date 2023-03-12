package com.company.StringQuestions;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String str = "anagram";
        String anagram = "nagram";
        System.out.println(isAnagram(str, anagram));
    }
    public static boolean isAnagram(String str, String anagram)
    {
        if(str.length()!=anagram.length()) return false;
        int[] arr = new int[128];
        for(char ch: str.toCharArray())
            arr[ch]++;
        for(char ch: anagram.toCharArray())
            if(--arr[ch] < 0)
                return false;
        return true;
    }
}
