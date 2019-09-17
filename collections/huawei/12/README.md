# 句子逆序

### [Source: HUA WEI]

### [Problem Description]
	
	将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
    所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符


    接口说明

    /**
     * 反转句子
     * 
     * @param sentence 原句子
     * @return 反转后的句子
     */
    public String reverse(String sentence);


### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
    将一个英文语句以单词为单位逆序排放。

    输出描述:
    得到逆序的句子

### [Design]
	
	1. 将输入的整数以字符串形式获取；
    2. 分割字符串
	2. 倒序遍历打印；

### [Note]

	倒序遍历注意i遍历范围；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printScentenceReversly(scanner.nextLine());
        }
    }
    
    public static void printScentenceReversly(String str) {
        String[] wordsArray = str.split(" ");
        for (int i = wordsArray.length-1; i >= 0; i-- ) {
            System.out.print(wordsArray[i] + " ");
        }
        System.out.println();
    }
}

```

### [Testing]

```

输入

I am a boy

输出

boy a am I

```