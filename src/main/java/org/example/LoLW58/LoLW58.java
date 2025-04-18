package org.example.LoLW58;

public class LoLW58 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.lengthOfLastWord("   fly me   to   the moon  ");
    }
}
class Solution {
    public int lengthOfLastWord(String s) {
        s =  s.trim();
        return s.substring(s.lastIndexOf(" ")+1).length();
    }
}