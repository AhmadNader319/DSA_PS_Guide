import ProblemSet.leetcode.Arrays.ArraySolutions;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;

import static ProblemSet.leetcode.Arrays.ArraySolutions.twoSum;


public class Main {
    static FileHandler fileHandler;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    static FileHandler fileWriter;
    public static void main(String[] args) throws IOException {
        String haystack = "butsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
