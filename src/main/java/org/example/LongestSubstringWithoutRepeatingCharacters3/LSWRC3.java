package org.example.LongestSubstringWithoutRepeatingCharacters3;

import java.util.HashSet;
import java.util.Set;

public class LSWRC3 {
    public static void main(String[] args) {
    Solution s  = new Solution();
        int str = s.lengthOfLongestSubstring("abcabcbb");
        System.out.println(str);
    }

}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0, left = 0 , right = 0;
        Set set = new HashSet();
        while(right < s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                answer = Math.max(answer,right-left +1);
                right++;
            }else{
                while(set.contains(c)){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return answer;
    }

}
