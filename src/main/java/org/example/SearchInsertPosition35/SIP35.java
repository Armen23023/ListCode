package org.example.SearchInsertPosition35;

public class SIP35 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 6}, 2));

    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0, last = nums.length - 1;

        while(first <= last ) {
            int mid = first + (last - first) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                last = mid - 1;
            }else first = mid + 1;

        }
        return first;
    }
}
