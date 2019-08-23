# [20] Valid Parentheses 有效的括号

### [Page Address]
	
	* https://leetcode.com/problems/valid-parentheses/description/
	*
	* algorithms
	* Easy (36.97%)
	* Total Accepted:    668.7K
	* Total Submissions: 1.8M

### [Problem Description]
	 
	* Given a string containing just the characters '(', ')', '{', '}', '[' and
	* ']', determine if the input string is valid.
	* 
	* An input string is valid if:
	* 
	* 
	* Open brackets must be closed by the same type of brackets.
	* Open brackets must be closed in the correct order.
	* 
	* 
	* Note that an empty string is also considered valid.
	* 
	* Example 1:
	* 
	* 
	* Input: "()"
	* Output: true
	* 
	* 
	* Example 2:
	* 
	* 
	* Input: "()[]{}"
	* Output: true
	* 
	* 
	* Example 3:
	* 
	* 
	* Input: "(]"
	* Output: false
	* 
	* 
	* Example 4:
	* 
	* 
	* Input: "([)]"
	* Output: false
	* 
	* 
	* Example 5:
	* 
	* 
	* Input: "{[]}"
	* Output: true

	给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

	有效字符串需满足：

	左括号必须用相同类型的右括号闭合。
	左括号必须以正确的顺序闭合。
	注意空字符串可被认为是有效字符串。

	示例 1:

	输入: "()"
	输出: true
	示例 2:

	输入: "()[]{}"
	输出: true
	示例 3:

	输入: "(]"
	输出: false
	示例 4:

	输入: "([)]"
	输出: false
	示例 5:

	输入: "{[]}"
	输出: true

### [Difficulty: EASY]	

### [Design]
	
	运用栈的特性，遍历字符串，遇到左半部分时压入右半部分，遇到右半部分时弹出。
	1. 如果任意一次弹出和当前字符不同，则不是有效的；
	2. 如果遍历还没结束，但是stack变空了，也不是有效的；
	3. 整个遍历顺利结束结束，且stack为空，则为有效的，反之则无效；

### [Note]

	1. 注意遍历过程没结束时，如果stack变为空，也是说明是无效匹配；
	2. 最后遍历结束，记得再判断一次stack是否为空，此时stack必需为空；

### [CodeWar]

```java

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else {
                if (stack.isEmpty() || c != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}	

```

### [Testing]

Input data:
"()"

Actual
  ✔ runtime: 0 ms
  ✔ answer: true
  ✔ stdout: ''

Expected
  ✔ runtime: 4 ms
  ✔ answer: true
  ✔ stdout: ''
	

### [Submission]

  ✔ Accepted
  ✔ 76/76 cases passed (1 ms)
  ✔ Your runtime beats 93.04 % of java submissions

	  