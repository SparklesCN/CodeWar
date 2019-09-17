# 汽水瓶

### [Source: HUA WEI]

### [Problem Description]
	
	有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？ 

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:

	输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。

	输出描述:

	对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。

### [Design]
	
	三种情况：
		1. 当前手里没有汽水瓶了，直接返回；
		2. 当手里大于2个汽水瓶，计算可以换多少瓶，换后手里还剩下几个瓶子；（一个空瓶子是不能换的，所以只考虑情况3，不考虑剩下1一个汽水瓶）；
		3. 当前手里有2个汽水瓶，可以借一瓶；

### [Note]

	None；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            numbersCouldDrink(scanner.nextInt());
        }
    }
    
    public static void numbersCouldDrink(int num) {
        int curBottleNum = num;
        int totalNum = 0;
        if (curBottleNum == 0) {
            return;
        }
        while (curBottleNum > 2) {
            totalNum += curBottleNum / 3;
            curBottleNum = curBottleNum / 3 + curBottleNum % 3;
        }
        if (curBottleNum == 2) {
            totalNum++;
        }
        System.out.println(totalNum);
    }
}

```

### [Testing]

```

输入

3
10
81
0

输出

1
5
40

```