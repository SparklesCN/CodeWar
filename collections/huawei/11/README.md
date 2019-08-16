# 数字颠倒

### [Source: HUA WEI]

### [Problem Description]
	
	输入一个整数，将这个整数以字符串的形式逆序输出

	程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	输入一个int整数

	输出描述:
	将这个整数以字符串的形式逆序输出

### [Design]
	
	1. 将输入的整数以字符串形式获取；
	2. 倒序遍历打印；

### [Note]

	倒序遍历注意i遍历范围；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printReversly(scanner.nextLine());
        }
    } 
    
    // print a string reversly
    public static void printReversly(String str) {
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println(res);
    }
}

```

### [Testing]

```

示例1
输入

1516000

输出

0006151

```