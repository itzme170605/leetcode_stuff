package substrings;

import java.util.ArrayList;
import java.util.List;

class Solution {

/**
 * 
 * @param s
 * @param numList
 * 
 * problem statement:
 * 2 - Given a string s, find the length of the longest 
 * substring
 * without repeating characters.
 * Constraints:
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
*/
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

    /**
     * problem 3 medium:
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
     * The overall run time complexity should be O(log (m+n)).
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int totalLength = nums1.length + nums2.length;
        int[] merged = new int[totalLength];
        int i1 = 0, i2 = 0, m = 0;
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] < nums2[i2]){
                merged[m++] = nums1[i1++];
            }else{
                merged[m++] = nums2[i2++];
            }
        }
        while(i1 < nums1.length){
            merged[m++] = nums1[i1++];
        }
        while(i2 < nums2.length){
            merged[m++] = nums2[i2++];
        }
        int mid = totalLength / 2;  

        if(totalLength % 2 == 1){
            return merged[mid];
        }else{
            return 0.5*(merged[mid] + merged[mid-1]);
        }
    }
    


}