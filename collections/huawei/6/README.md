# 质数因子

### [Source: HUA WEI]

### [Problem Description]
	
	功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）

	最后一个数后面也要有空格

	详细描述：


	函数接口说明：

	public String getResult(long ulDataInput)

	输入参数：

	long ulDataInput：输入的正整数

	返回值：

	String

### [Difficulty: MEDIUM]

### [Problem Requirnment]
	
	输入描述:
	输入一个long型整数

	输出描述:
	按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。

### [Design]
	
	利用分解质因数规则：
		https://www.shuxuele.com/prime-factorization.html

### [Note]

	如何将char转换为String:
		1. String str = 'c' + "";
		2. String str = Character.toString('c');

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printPrims(scanner.nextLong());
        }
        
    }
    
    public static void printPrims(long num) {
        if (num == 0) 
        {
            System.out.println("0 ");
            return;
        }
        String res = "";
        int curPrim = 2;
        while (num != 1) {
            while (num % curPrim == 0) {
                res = res + curPrim + " ";
                num = num / curPrim;
            }
            curPrim++;
        }
        System.out.println(res);
    }
}

```

### [Testing]

```

输入

180

输出

2 2 3 3 5

```