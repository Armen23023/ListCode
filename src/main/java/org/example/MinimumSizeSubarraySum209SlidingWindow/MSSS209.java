package org.example.MinimumSizeSubarraySum209SlidingWindow;

public class MSSS209 {
    public static void main(String[] args) {
    Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int  right = 0;
        int min = 10000000; int sum = 0;
        for(int left = 0; left < nums.length;){

            if(sum < target && right < nums.length){
                sum = sum + nums[right];
                right++;
            }else{
                sum = sum - nums[left];
                left++;
            }
            if(sum >= target){
                min = Math.min(min,right-left);
            }
        }
        if(min == 10000000) return 0;
        return min;
    }
}
