package org.example.TwoSum1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.twoSum(new int[]{3, 2, 4}, 6);

        System.out.println(s);
    }


}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if (nums[i] + nums[map.get(target - nums[i])] == target
                        && i != map.get(target - nums[i])) {
                    arr.add(i);
                    arr.add(map.get(target - nums[i]));
                    break;
                }
            }

        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}
