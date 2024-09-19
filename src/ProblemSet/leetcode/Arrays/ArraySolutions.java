package ProblemSet.leetcode.Arrays;

import java.util.*;

public class ArraySolutions {
    public static int[] twoSum(int[] nums, int target) {
        //1. Two Sum
        //https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array&difficulty=EASY
        //Easy
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];

            // Check if the complement is in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }

            // Add the current number and its index to the map, avoiding duplicates
            map.put(nums[i], i);
            /*
            avoiding duplicates by this way

             */
        }
        return null;
    }
    public int maxArea(int[] height) {
        //11. Container With Most Water
        //LeetCode link:https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=array
        //Med
        int right = height.length - 1;
        int left = 0;
        int maxArea = 0;

        while (left < right) {
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer which points to the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--; // Decrement right to move it towards the left
            }
        }
        if (height[left] < height[right]) {
            return maxArea;
        }
        return maxArea;
    }
    public int[] productExceptSelf(int[] nums) {
        //238. Product of Array Except Self
        //https://leetcode.com/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=array&difficulty=MEDIUM
        //Med
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        // Calculate prefix products
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // Calculate suffix products
        suffix[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // Calculate final answer
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
    public int removeElement(int[] nums, int val) {
        //27. Remove Element
        //https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=array&difficulty=EASY
        //Easy
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                nums[i] = nums[j];
                j--;
            } else {
                i++;
            }
        }
        return i;
    }


    public int removeDuplicates(int[] nums) {
        //26. Remove Duplicates from Sorted Array
        //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
        //Easy
        int j = 1;
        int i = 0;
        while (j < nums.length){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        //
        //https://leetcode.com/problems/3sum/?envType=problem-list-v2&envId=array
        //Medium
        List<List<Integer>> result = new ArrayList<>();

        // Sort the input array to use the two-pointer technique
        Arrays.sort(nums);

        // Iterate through the array, fixing one element and using two pointers to find the other two
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the fixed element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Initialize two pointers
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if (sum > 0)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }
    public int searchInsert(int[] nums, int target) {
        if (target<=nums[0])
            return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
