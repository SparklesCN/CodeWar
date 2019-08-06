# Remove Repeat Chars in String

### [Source: HUA WEI]

### [Problem Description]
	给出一个字符串，将重复的字符去除，仅保留第一次出现的字符，且保持去重后的字符在原字符串中的顺序不变。

### [Difficulty: EASY]

### [Problem Requirnment]
	输入数据是一个字符串（不包含空格）

	输出去重后的字符串

	输入：12ere2

	输出：12er

### [Design]
	1. 将字符串转为字符列表；
	2. 用HashMap存下每个字符第一次出现的Index；
	3. 遍历整个字符串列表，仅保留符合HashMap记录数据的字符；

### [CodeWar]

```java

import java.io.*;
import java.util.*;

public class removeRepeats {

	public static String removeRepeat (String input) {
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (map.containsKey(inputArray[i])) {
				continue;
			}
			else {
				map.put(inputArray[i], i);
				counter++;
			}
		}
		char[] resultArray = new char[counter];
		int innerCounter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (map.get(inputArray[i]) == i) {
				resultArray[innerCounter++] = inputArray[i];
			}
			else {
				continue;
			}
		}
		String result = new String(resultArray);
		return result;
	}
}

```

### [Testing]

```java

public static void main(String[] args) {
		String test_1 = "abacbd";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_1));
		System.out.println("should be: abcd");

		String test_2 = "abc";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_2));
		System.out.println("should be: abc");

		String test_3 = "aaa";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_3));
		System.out.println("should be: a");

		String test_4 = "aabbccdd";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_4));
		System.out.println("should be: abcd");

		String test_5 = "12ere2";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_5));
		System.out.println("should be: 12er");

		/*
		output is: abcd
		should be: abcd
		output is: abc
		should be: abc
		output is: a
		should be: a
		output is: abcd
		should be: abcd
		output is: 12er
		should be: 12er
		*/
	}

```