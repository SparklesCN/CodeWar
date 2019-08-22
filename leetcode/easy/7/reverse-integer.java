/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.42%)
 * Total Accepted:    770K
 * Total Submissions: 3M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
class Solution {
    public int reverse(int x) {
        boolean isNeg = x < 0 ? true : false;
        String str = x+"";
        if (isNeg) {
            str = str.substring(1);
        }
        StringBuffer sBuffer = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sBuffer.append(str.charAt(i));
        }
        if (isNeg) {
            sBuffer.insert(0, '-');
        }
        try {
            return Integer.parseInt(sBuffer.toString());
        }
        catch (Exception e) {
            return 0;
        }
        
    }
}