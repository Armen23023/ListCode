package org.example.ValdParentheses20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class VP20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isValid("]");
    }


}
class Solution {
    public boolean isValid(String s) {


        char opSim1 = '(';
        char opSim2 = '{';
        char opSim3 = '[';
        char clSim1 = ')';
        char clSim2 = '}';
        char clSim3 = ']';
        Map<Character,Character> map  =new HashMap();
        map.put(opSim1,clSim1);
        map.put(opSim2,clSim2);
        map.put(opSim3,clSim3);

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == opSim1 || c == opSim2 || c == opSim3) {
                stack.push(c);
                continue;
            }
            if (!stack.isEmpty() && c == clSim1 || c == clSim2 || c == clSim3) {
                char character = stack.pop();
                if(c != map.get(character)){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        if(stack.size() == 0 ){
            return true;
        }else return false;

    }
}

