package org.example.DefusetheBomb1652;

public class DTB1652 {
    public static void main(String[] args) {
    Solution solution = new Solution();
        int[] decrypt = solution.decrypt(new int[]{10,5,7,7,3,2,10,3,6,9,1,6}, -4);
        for (int i = 0; i < decrypt.length ; i++) {
            System.out.println(decrypt[i]);
        }

    }
}

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ret = new int[code.length];
        int n = 0;
        int first  = k<0?code.length - Math.abs(k):1;
        int end = first + Math.abs(k)-1;

        int counter = first;
        int sum = 0;

        for(int i = 0; i < code.length;i++){

            while(n!=Math.abs(k)){
                sum = sum + code[counter];
                counter++;
                if(counter==code.length){
                    counter = 0;
                }
                n++;
            }
            ret[i] = sum;
            sum = sum - code[first];
            first++;
            if(first == code.length){
                first = 0;
            }
            end++;
            if(end >= code.length){
                end = 0;
            }

            sum = sum + code[end];
        }
        return ret;
    }
}
