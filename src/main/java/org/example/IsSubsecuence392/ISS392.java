package org.example.IsSubsecuence392;

public class ISS392 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("", "wdwad"));
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int first = 0;
        if(s.isEmpty()) return true;
        if(t.isEmpty()) return false;

        for(int second = 0; second < t.length();){
            if(s.charAt(first) == t.charAt(second)){
                first++;
                second++;
                if(first == s.length()){
                    return true;
                }
            }else{
                second++;
            }
        }
        return false;
    }
}
