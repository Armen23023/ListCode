package org.example.LongestCommonPrefix14;

import java.util.Arrays;

public class LCP14 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        int first = strs[0].length();
        int last = strs[strs.length-1].length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Math.min(first,last); i++){
            if (strs[0].charAt(i) != strs[strs.length-1].charAt(i)){
                return sb.toString();
            }else {
                sb.append(strs[0].charAt(i));
            }
        }

        return sb.toString();
    }
}
