/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 *
 * https://leetcode.com/problems/reverse-string/description/
 *
 * algorithms
 * Easy (63.72%)
 * Total Accepted:    477.9K
 * Total Submissions: 748.4K
 * Testcase Example:  '["h","e","l","l","o"]'
 *
 * Write a function that reverses a string. The input string is given as an
 * array of characters char[].
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * You may assume all the characters consist of printable ascii
 * characters.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * 
 * 
 * 
 * 
 */
class Solution {
    public void reverseString(char[] s) {
      int leftIndex  = 0;
      int rightIndex = s.length - 1;
      while (leftIndex < rightIndex) {
        swap(s, leftIndex++, rightIndex--);
      }
    }
    public void swap (char[] s, int a, int b) {
      char temp = s[b];
      s[b] = s[a];
      s[a] = temp;
    }
}
