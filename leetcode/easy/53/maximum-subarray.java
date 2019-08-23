/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (44.17%)
 * Total Accepted:    601.5K
 * Total Submissions: 1.4M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum.
 * 
 * Example:
 * 
 * 
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * 
 * 
 * Follow up:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 */
class Solution {
    public int maxSubArray(int[] nums) {
      int max = nums[0];
      int sum = 0;
      for (int num : nums) {
        // if sum > 0, means still possible get a greater sum;
        // 如果sum大于零，意味着相加还有可能得到一个更大的sum；
        if (sum > 0) {
          sum += num;
        }
        // if sum <= 0, means cur sum won't be helpful for get a greater sum, so just set num equals cur num (begin a new counting trip for new subarray);
        // 如果sum小于等于0，意味着当前的sum不会对接下来的获取更大sum的过程有任何帮助，所以直接将sum的值设置为当前num的值（开启一段新的子序列计算）；
        else {
          sum = num;
        }
        // update the max sum;
        // 更新现有的max值
        max = Math.max(max, sum);
      }
      return max;
    }
}
