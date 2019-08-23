# [7] Reverse Integer 整数反转

### [Page Address]
	* https://leetcode.com/problems/reverse-integer/description/
	*
	* algorithms
	* Easy (25.42%)
	* Total Accepted:    770K
	* Total Submissions: 3M

### [Problem Description]
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

	给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

	示例 1:

	输入: 123
	输出: 321
	 示例 2:

	输入: -123
	输出: -321
	示例 3:

	输入: 120
	输出: 21
	注意:

	假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

### [Difficulty: EASY]	
	
### [Design]

	1. 判断和记录数字是否为负；
	2. 将数字转换为字符串；
	3. 如果是负数，截取’-‘后面的字符串；
	4. 翻转字符串；
	5. 如果是负数，第一位补充’-‘；
	
### [Note]
	
	1. StringBuffer可以实现插入功能；
	2. 在把字符串转换为整数过程中，为防止整数大小溢出，需要catch exception;

### [CodeWar]

```java

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


```

### [Testing]

	Input data:
	123

	Actual
	  ✔ runtime: 1 ms
	  ✔ answer: 321
	  ✔ stdout: ''

	Expected
	  ✔ runtime: 4 ms
	  ✔ answer: 321
	  ✔ stdout: ''

### [Submission]

	✔ Accepted
	✔ 1032/1032 cases passed (2 ms)
	✔ Your runtime beats 18.94 % of java submissions