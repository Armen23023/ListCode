package org.example.RotateImage48;

public class RI48 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] newMatrix = new int[n][m];

        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                newMatrix[j][m-1-i] = matrix[i][j];
            }
        }

        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}
