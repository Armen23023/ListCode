package org.example.SQRT69;

public class SQRT69 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147483647));

    }


}

class Solution {
    public int mySqrt(int x) {
        int i = 2;
        double cur = i;
        while(i < x){

            if(cur * i == x){
                return i;
            }else{
                cur = cur * i;
            }
            if(cur > x){
                break;
            }
            i++;
            cur = i;
        }

        return i-1;
    }
}
