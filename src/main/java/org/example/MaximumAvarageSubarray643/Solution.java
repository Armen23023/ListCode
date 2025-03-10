package org.example.MaximumAvarageSubarray643;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double  max  = -100000000000000000d;
        int start = 0;
        double windowSum = 0;


        for(int end = 0; end < nums.length;end++){
            windowSum+=nums[end];
            if(end-start+1 == k){
                max = Math.max(max,windowSum/k);

                windowSum-=nums[start];
                start++;
            }
        }
        return max;
    }
}

class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        double maxAverage = solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);
    }
}