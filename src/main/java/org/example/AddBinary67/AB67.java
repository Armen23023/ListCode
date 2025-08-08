package org.example.AddBinary67;

public class AB67 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1"));
    }

}

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ret = new StringBuilder();
        int carry = 0;
        int sum = 0;

        int i = a.length() - 1;
        int j = b.length()-1;

        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }
            ret.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;

        }
        if(carry != 0) ret.append(carry);
        return ret.reverse().toString();
    }
}
