package org.example.ContainerWithMostWater11;

public class CWMW11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}

class Solution {
    public int maxArea(int[] height) {

        int left = 0,right = height.length-1;
        int ret =  0;
        int val;


        while(left != right){

            if(height[left] < height[right] ){
                val = height[left] * (right-left);
                left++;
            }else{
                val = height[right] * (right-left);
                right--;
            }


            if(ret < val){
                ret = val;
            }
        }
        return ret;
    }
}