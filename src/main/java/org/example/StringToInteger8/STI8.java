package org.example.StringToInteger8;

public class STI8 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("  -042"));

    }
}
class Solution {
    public int myAtoi(String s) {
        Long ret =0L;
        int j = 0;
        int sign = 1;
        s = s.trim();
        if(s.isEmpty()){
            return 0;
        }

        if(s.charAt(j) == '+' || s.charAt(j) == '-') {
            sign = (s.charAt(j++) == '-') ? -1 : 1;
        }
        for(int i = j; i< s.length();i++){
            if(Character.isDigit(s.charAt(i)) ){
                ret = ret * 10 + Integer.parseInt(s.charAt(i)+"");
                if (ret < Integer.MIN_VALUE || ret > Integer.MAX_VALUE) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else break;
        }


        return ret.intValue() * sign;
    }
}
