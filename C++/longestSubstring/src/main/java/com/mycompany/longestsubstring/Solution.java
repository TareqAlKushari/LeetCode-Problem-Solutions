package com.mycompany.longestsubstring;

public class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        String sub = new String();
        for(int i = 0; i < s.length(); i++) {
            sub = s.substring(0);
        }
        
        int longest = sub.length();
        return longest;
    }
}
