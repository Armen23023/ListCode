package org.example.LetterCombinationOfAPhoneNumber17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LCOAPN17 {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
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
        
        if (digits == null || digits.isEmpty()) {return Arrays.asList();}
        int n = digits.length();

        for (int i = 0; i < n; i++) {
            backtracking();
        }
    return list;

    }

    private StringBuilder backtracking() {
        StringBuilder sb = new StringBuilder();


        return null;
    }


}