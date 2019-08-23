# [344] Reverse String 反转字符串

### [Page Address]
	
	* https://leetcode.com/problems/reverse-string/description/
	*
	* algorithms
	* Easy (63.72%)
	* Total Accepted:    477.9K
	* Total Submissions: 748.4K

### [Problem Description]

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

	编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

	不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

	你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。

	 

	示例 1：

	输入：["h","e","l","l","o"]
	输出：["o","l","l","e","h"]
	示例 2：

	输入：["H","a","n","n","a","h"]
	输出：["h","a","n","n","a","H"]

### [Difficulty: EASY]	

### [Design]

	从左右两边界开始，左指针所对应字符和右指针所对应字符互相交换，直到左右两指针重叠或交叉；
	
### [Note]

	1. swap函数可以帮助交换值；
	2. java函数中对于数组array的传递为引用传递；

### [CodeWar]

```java

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

```

### [Testing]

Input data:
["h","e","l","l","o"]

Actual
  ✔ runtime: 0 ms
  ✔ answer: ["o","l","l","e","h"]
  ✔ stdout: ''

Expected
  ✔ runtime: 4 ms
  ✔ answer: ["o","l","l","e","h"]
  ✔ stdout: ''

### [Submission]

	✔ Accepted
	✔ 478/478 cases passed (1 ms)
	✔ Your runtime beats 94.59 % of java submissions 