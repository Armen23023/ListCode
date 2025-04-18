package org.example.CountAndSay38;

public class CAS38 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(4));
    }
}

class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for(int i = 0 ; i < n-1 ; i++){
             s = stringToArray(s);
        }
        return s;
    }

    private String stringToArray(String s){

        char c = s.charAt(0);
        int size = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                size++;
            }else {
                sb.append(size);
                sb.append(c);
                size = 1;
                c = s.charAt(i);
            }
        }
        sb.append(size).append(c);
        return sb.toString();
    }

}
