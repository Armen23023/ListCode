package org.example.RansomNote383;

import java.util.HashMap;
import java.util.Map;

public class RN383 {
    public static void main(String[] args) {
    Solution solution = new Solution();
    solution.canConstruct("aa","ab");
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i< magazine.length();i++){
            char c = magazine.charAt(i);
            if(map.containsKey(c)){
                int count =  map.get(c);
                count++;
                map.put(c,count);
            }else{
                map.put(c,1);
            }
        }

        for(int i = 0; i < ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){

                int count = map.get(c);
                count--;
                map.put(c,count);
            }else{
                return false;
            }
        }
        return true;

    }
}