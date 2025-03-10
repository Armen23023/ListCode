package org.example.fruitIntoBaskets904SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FIB904 {
    public static void main(String[] args) {
    Solution solution = new Solution();
        System.out.println(solution.totalFruit(new int[]{0, 1, 2, 2}));

    }
}


class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0;
        int max = 0;
        Map<Integer,Boolean> map = new HashMap<>();

        for(int end = 0; end < fruits.length; end ++){
            int treeType = fruits[end];
            if(map.size()<2 && !map.containsKey(treeType)){
                map.put(treeType,true);
                max = Math.max(max, end - start+1);
            } else if (map.containsKey(treeType)) {
                max = Math.max(max, end - start+1);
            }else {
                map = new HashMap<>();
                map.put(fruits[end-1],true);
                map.put(treeType,true);
                start = end-1;

                while (fruits[start] == fruits[start-1]) {
                    start--;
                }
                max = Math.max(max, end - start+1);
            }
        }
        return max;
    }
}