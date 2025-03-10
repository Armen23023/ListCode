package org.example.ThekthFactorOfN1492;

import java.util.ArrayList;
import java.util.List;

public class TKFON1492 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kthFactor(7, 2));
    }
}
class Solution {
    public int kthFactor(int n, int k) {

        List list = new ArrayList();
        for(int i = 1; i <= n; i++ ){
            if(n % i == 0){
                list.add(i);
            }
        }
        if(list.size()>=k){
            return (int) list.get(k-1);
        }else return -1;
    }
}