package com.company.StringQuestions;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(lengthOfLongestSubstring(str));
        // For detailed soln refer to:
        // https://leetcode.com/problems/longest-substring-without-repeating-characters/solutions/2133524/java-c-a-reall-detailed-explanation/?orderBy=hot
    }
    public static int lengthOfLongestSubstring(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            }
            else if(map.size() < j - i + 1){
                while(map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
