/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (44.38%)
 * Total Accepted:    2M
 * Total Submissions: 4.5M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * Example:
 * 
 * 
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] copyNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copyNums[i] = nums[i];
        }
        Arrays.sort(copyNums);
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int sum = copyNums[leftIndex] + copyNums[rightIndex];
            if (sum < target) {
                leftIndex++;
            } else if (sum > target) {
                rightIndex--;
            } else {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == copyNums[leftIndex]) {
                result[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == copyNums[rightIndex]) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}