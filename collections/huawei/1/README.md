# Count the length of last word

### [Source: HUA WEI]

### [Problem Description]
	
	计算字符串最后一个单词的长度，单词以空格隔开。 

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	一行字符串，非空，长度小于5000。

	输出描述:
	整数N，最后一个单词的长度。

### [Design]
	1. 运用split方法将包含多单词的字符串分割为String Array；
	2. 直接获取最后一位的字符串长度；

### [Note]
	str.split()方法:
		str = "hello world";
		str.split 
			-> return type: String[] 
		{hello, world}

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] inputArray = scanner.nextLine().split(" ");
            System.out.println(inputArray[inputArray.length-1].length());
        }
    }
}

```

### [Testing]

```

输入

hello world

输出

5

```