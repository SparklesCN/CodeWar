# 字符个数统计

### [Source: HUA WEI]

### [Problem Description]
	
	编写一个函数，计算字符串中含有的不同字符的个数。
	字符在ACSII码范围内(0~127)。不在范围内的不作统计。

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	输入N个字符，字符在ACSII码范围内。

	输出描述:
	输出范围在(0~127)字符的个数。

### [Design]
	
	1. 用HashMap判断当前字符是否出现过，和记录新字符；
	2. 如果没出现过，且满足ascii范围，则加入HashMap，并给counter + 1；
	3. 返回counter;

### [Note]

	1. 如何拿到char对应的ASCII码：
		char c = 'a';
		int cAscii = c;

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printNumInRangeOfAcsii(scanner.nextLine());
        }
    }
    
    public static void printNumInRangeOfAcsii(String str) {
        char[] charArray = str.toCharArray();
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (char c:charArray) {
            int acsiiIndex = c;
            if (acsiiIndex > 0 && acsiiIndex < 127) {
                if (map.containsKey(acsiiIndex)) {
                    continue;
                }
                counter++;
                map.put(acsiiIndex, 1);
            }
            
        }
        System.out.println(counter);
    }
}

```

### [Testing]

```

输入

abc

输出

3

```