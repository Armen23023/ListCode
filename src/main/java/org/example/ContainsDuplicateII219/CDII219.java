package org.example.ContainsDuplicateII219;

public class CDII219 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j = nums.length-1;
        int minLen = 100000;

        for(int i = 0;i<nums.length;i++,j--){
            if(i!=j){
                if(nums[i] == nums[j]){
                    if(Math.abs(i-j)< minLen){
                        minLen = Math.abs(i-j);
                    }
                }
            }
        }
        return minLen <= k;
    }
}
