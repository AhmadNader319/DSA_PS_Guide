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
        int[] result1 = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Expected Output: [0, 1]

        int[] result2 = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Expected Output: [1, 2]

        int[] result3 = twoSum(new int[]{3, 3}, 6);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Expected Output: [0, 1]
    }



        Scanner scanner = new Scanner(System.in);
        List<String> listOOPProblems = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return "";
            }

            @Override
            public String set(int index, String element) {
                return "";
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return "";
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };
    }
