package org.example.PlusOne66;

import java.util.Arrays;

public class PO66 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i : solution.plusOne(new int[]{0})) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                digits[i]++;
                return digits;
            }
        }
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}
