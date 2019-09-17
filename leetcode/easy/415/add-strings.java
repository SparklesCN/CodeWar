/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 *
 * https://leetcode.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (44.22%)
 * Total Accepted:    109.1K
 * Total Submissions: 246.1K
 * Testcase Example:  '"0"\n"0"'
 *
 * Given two non-negative integers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to
 * integer directly.
 * 
 * 
 */

class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuffer sBuffer = new StringBuffer();
        // i, j is index pointer for num1 and num2
        // i, j 是关于index的指针
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        // while carry not empty and i, j not out of bound
        // 循环直到carry值为0，并且i, j 需要超出范围，即 < 0
        while (carry != 0 || i >= 0 || j >= 0) {
            // convert to int by ascii calculation
            // '0' - '0' = 0
            // '8' - '0' = 8
            // reversly get last num in i, j
            // then add them together, saved in carry;
            // 利用ascii码特性来获取当前整数
            // 两整数相加，存于carry中
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            // append only last digit unit
            // 只将carry中个位存入结果字符串
            sBuffer.append(carry%10);
            // erase the last digit unit, save former unit and continue
            // 舍弃carry中个位，保留其余位 （手动进位）
            carry /= 10;
        }
        // reverse the sBuffer, and convert to string
        // 反转sBuffer，然后转换为字符串
        return sBuffer.reverse().toString();
    }
}

