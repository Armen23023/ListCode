package org.example.PalindromeNumber9;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(1001);
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        List list = new ArrayList();
        while(x!=0){
            list.add(x%10);
            x = x /10;
        }

        for(int i = 0; i < list.size()/2; i++){
            if(list.get(i) != list.get(list.size()-i-1)){
                return false;
            }
        }
        return true;
    }
}
