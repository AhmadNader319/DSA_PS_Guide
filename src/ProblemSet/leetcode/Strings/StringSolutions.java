package ProblemSet.leetcode.Strings;
import java.util.*;
public class StringSolutions {
    public int lengthOfLongestSubstring(String s) {
        //3. Longest Substring Without Repeating Characters
        //https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=string&difficulty=EASY
        //Medium
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(charIndexMap.get(currentChar) + 1, left);
            }

            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static int strStr(String haystack, String needle) {
        /*
        28. Find the Index of the First Occurrence in a String
        https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1398553864/?envType=problem-list-v2&envId=string&difficulty=EASY
        Easy
        */
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
