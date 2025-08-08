package org.example.LetterCombinationOfAPhoneNumber17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class LCOAPN17 {
    public static void main(String[] args) {

    }
}

class Solution {
    List<String> list = new LinkedList<>();

    Map<Character, char[]> keyboard = Map.of(
            '2', new char[] { 'a', 'b', 'c' },
            '3', new char[] { 'd', 'e', 'f' },
            '4', new char[] { 'g', 'h', 'i' },
            '5', new char[] { 'j', 'k', 'l' },
            '6', new char[] { 'm', 'n', 'o' },
            '7', new char[] { 'p', 'q', 'r', 's' },
            '8', new char[] { 't', 'u', 'v' },
            '9', new char[] { 'w', 'x', 'y', 'z' }
    );
    char[] arr;
    public List<String> letterCombinations(String digits) {


        if (digits.isEmpty()) return list;
        this.arr = digits.toCharArray();
        Stack<Character> stack = new Stack<>();
        backtracking(stack,0);
        return list;
    }

    private void backtracking(Stack<Character> stack, int index) {
        if (index == arr.length) {
            list.add(convertString(stack));
            return;
        }
        char[] s = keyboard.get(arr[index]);
        for (char curChar : s) {
            stack.push(curChar);
            backtracking(stack,index+1);
            stack.pop();
        }

    }

    private String convertString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }

}