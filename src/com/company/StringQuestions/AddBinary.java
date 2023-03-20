package com.company.StringQuestions;

public class AddBinary {
    // Refer Explanation :
    //https://leetcode.com/problems/add-binary/solutions/1679423/well-detailed-explaination-java-c-python-easy-for-mind-to-accept-it/?orderBy=most_votes
    public static void main(String[] args) {
        String s1 = "1111";
        String s2 = "1111";
        System.out.println(addBinary(s1,s2));
    }
    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
