package substrings;

import java.util.ArrayList;
import java.util.List;

class Solution {

    private void alt(String s, List numList) {
        if (s.isEmpty()) {
            return;
        }
        String temp = "";
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!temp.contains(String.valueOf(c))) {
                count++;
                temp += c;
            } else {
                break;
            }
        }
        numList.add(count);
        alt(s.substring(1), numList);

    }
    public int lengthOfLongestSubstring(String s) {
        List<Integer> numList = new ArrayList<>();
        alt(s, numList);
        int max = 0;
        for (int num : numList) {
            if (num > max) {
                max = num;
            }
        }
        return max;
        
    }
}