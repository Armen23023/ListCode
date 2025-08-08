package org.example.BestTimeToBy121;

public class BTTBASS121 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

}
class Solution {
    public int maxProfit(int[] prices) {
        int ret = 0;
        int cur = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(cur > prices[i]){
                cur = prices[i];
            }else{
                if(prices[i] - cur > ret)
                    ret = prices[i] - cur;
            }
        }
        return ret;
    }
}