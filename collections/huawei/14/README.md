# 求int型数据在内存中存储时1的个数

### [Source: HUA WEI]

### [Problem Description]
	
输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。


### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:

	 输入一个整数（int类型）

	输出描述:

	 这个数转换成2进制后，输出1的个数


### [Design]
	
	1. 将整数输入利用Integer.toBinaryString(Type : int) 方法转变为binary string；
	2. 查询1的个数；

### [Note]

	Integer.toBinaryString(Type : int) 方法可以把int 变为 binary string;

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printAsBinary(scanner.nextInt());
        }
    }
    
    public static void printAsBinary(int num) {
        String binaryStr = Integer.toBinaryString(num);
        int counter = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            if (binaryStr.charAt(i) == '1') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

```

### [Testing]

```

输入

5

输出

2

```