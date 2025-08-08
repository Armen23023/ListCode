package org.example.ZigZagConversion6;


public class ZZC6 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String paypalishiring = solution.convert("PAYPALISHIRING", 3);
        System.out.println(paypalishiring);

    }
}
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        char [][] matrix = new char[numRows][s.length()];
        int  counter = s.length();
        int sumer = 0;

        for(int i = 0,j=0; sumer < counter ; i++){

            for(j = 0; j < numRows && sumer<counter; ++j){
                matrix[j][i] = s.charAt(sumer++);
            }

            for(int k = 1; k < numRows-1 && sumer<counter ;k++) {
                matrix[j - 2 ][i + 1] = s.charAt(sumer++);
                j--;
                i++;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    sb.append(matrix[i][j]);
                }
            }
        }
        return sb.toString();
    }
}