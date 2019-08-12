# 进制转换

### [Source: HUA WEI]

### [Problem Description]
	
	写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	输入一个十六进制的数值字符串。

	输出描述:
	输出该数值的十进制字符串。

### [Design]
	
	1. 利用str.substring拆离出有效计数位；
	2. 使用Integer.parseInt()转换有效计数位；

### [Note]

	关于利用java内置库将非十进制数字转化到十进制：
	 举例：转化 "0xA" -> 10
	 	Integer.parseInt("A", 16); -> 10

	 java official docs:
	 	https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String,%20int)

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine().substring(2);
            int result = Integer.parseInt(input, 16);
            System.out.println(result);
        }
    }
}

```

### [Testing]

```

输入

0xA

输出

10

```