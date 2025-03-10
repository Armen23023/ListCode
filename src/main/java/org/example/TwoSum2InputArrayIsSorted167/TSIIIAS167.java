package org.example.TwoSum2InputArrayIsSorted167;

public class TSIIIAS167 {
    public static void main(String[] args) {
    Solution solution = new Solution();
        int[] ints = solution.twoSum(new int[]{5,25,75}, 100);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int second = numbers.length-1;

        for(int first = 0;first < numbers.length;){
            if(numbers[first] + numbers[second] > target){
                second--;
            }else if(numbers[first]+ numbers[second] < target){
                first++;
            }else{
                return new int[]{first+1,second+1};
            }
        }
        return new int[]{};
    }
}
