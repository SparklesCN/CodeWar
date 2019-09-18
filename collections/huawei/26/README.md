# 字符串排序

### [Source: HUA WEI]

### [Problem Description]
	
	编写一个程序，将输入字符串中的字符按如下规则排序。

	规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。

	       如，输入： Type   输出： epTy

	规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。

	     如，输入： BabA   输出： aABb

	规则 3 ：非英文字母的其它字符保持原来的位置。

	     如，输入： By?e   输出： Be?y

### [Difficulty: EASY]

### [Problem Requirnment]
	
	样例：

	    输入：

	   A Famous Saying: Much Ado About Nothing(2012/8).

	    输出：

  	 A  aaAAbc   dFgghh :  iimM   nNn   oooos   Sttuuuy  (2012/8).

### [Design]
	
	1. 获取输入；
	2. 新建StringBuffer，利用ASCII码识别字母，并按照原本顺序加入所有字母字符；
	3. 利用ASCII码筛出所有非字母字符，并利用StringBuffer特性将其插入原本index；

### [Note]

	利用ASCII码辨别非字母字符；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printSortStr(scanner.nextLine());
        }
        scanner.close();
    }
    
    public static void printSortStr(String str) {
        StringBuffer sBuffer = new StringBuffer();
        // 利用ascii码来遍历aA-zZ;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                char curChar = str.charAt(j);
                if (curChar == 'A' + i || curChar == 'a' + i) {
                    sBuffer.append(curChar);
                }
            }
        }
        // 利用ascii码来筛出所有非字母；
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            if (curChar >= 'a' && curChar <= 'z' ) {
                continue;
            }
            else if (curChar >= 'A' && curChar <= 'Z') {
                continue;
            }
            // 利用StringBuffer特性，将非字母符号插入原本index；
            sBuffer.insert(i, curChar);
        }
        System.out.println(sBuffer);
    }
}

```

### [Testing]

```

	输入
	
	A Famous Saying: Much Ado About Nothing (2012/8).

	输出
	
	A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).

```