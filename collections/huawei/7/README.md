# 取近似值

### [Source: HUA WEI]

### [Problem Description]
	
	写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	输入一个正浮点数值

	输出描述:
	输出该数值的近似整数值

### [Design]
	
	1. 将double类型输入转化为字符串；
	2. 分离出最后一位；
	3. 分离出整数部分；
	4. 如果最后一位小数大于等于5，整数部分在原值基础加一；
	5. 返回新整数部分；

### [Note]
	
	本题没有考虑小数点后超过一位的情况，仅适用于小数点后仅有一位的情况；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printFloatAsInt(scanner.nextFloat());
        }
    }
    
    public static void printFloatAsInt(float num) {
        String numStr = Float.toString(num);
        String floatPartStr = numStr.substring(numStr.length()-1);
        Integer numPart = Integer.parseInt(numStr.substring(0, numStr.length()-2));
        if (Integer.parseInt(floatPartStr) >= 5) {
            numPart++;
        }
        System.out.println(numPart);
    }
}

```

### [Testing]

```

输入

5.5

输出

6

```