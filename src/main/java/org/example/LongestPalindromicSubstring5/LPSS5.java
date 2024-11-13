package org.example.LongestPalindromicSubstring5;

public class LPSS5 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.longestPalindrome("cbbd");
        System.out.println(s);
    }
}
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;

            longest = getString(s, longest, left, right);
            right = i+1;
            longest = getString(s, longest, left, right);
        }

        return longest;
    }

    private String getString(String s, String longest, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

                if (s.substring(left,right+1).length() > longest.length()) {
                    longest = s.substring(left,right+1);
                }
                left--;
                right++;

        }
        return longest;
    }
}
