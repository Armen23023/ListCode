package org.example.ReverseInteger7;

public class RI7 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(123));
    }
}

class Solution {
    public int reverse(int x) {
        int  y = 0;
        Long ret = 0L;
        int i = 10;
        while(x > 0){
            y = x % 10;

            ret = ret *i + y;
            if (ret > Integer.MAX_VALUE  || ret < Integer.MIN_VALUE ) return 0;

            x = x /10;
        }

        return ret.intValue();

    }
}
