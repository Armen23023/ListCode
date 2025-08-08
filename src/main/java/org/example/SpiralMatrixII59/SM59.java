package org.example.SpiralMatrixII59;

public class SM59 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateMatrix(5);
    }
}
class Solution {
    public int[][] generateMatrix(int n) {

        int [][] arr = new int[n][n];
        int c = 1;

        for(int i = 0 ; i < n; i++){
            int k = i;
            for(int j = i; j < n-i; j++){
                arr[i][j] = c++;
            }
            if (c>n*n) return arr;

            k++;
            for(int j = n-1-i; k < n-i; k++){
                arr[k][j] = c++;
            }
            k--;
            for(int j = n-i-2; j >= i; j--){
                arr[k][j] = c++;
            }
            k--;
            for(int j = i; k > i; k--){
                arr[k][j] = c++;
            }
        }
        return arr;

    }
}
