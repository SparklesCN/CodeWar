# 计算目标字符个数

### [Source: HUA WEI]

### [Problem Description]
	
	写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。

	输出描述:
	输出输入字符串中含有该字符的个数。

### [Design]
	
	1. 由于本题不区分字母大小写，在把整个字符串直接转化为统一小写字母的charArray；
	2. 将目标字符也按照统一标准转化为小写字母；
	3. 遍历整个charArray进行比较并计数；
### [Note]

	1. Character.toLowerCase(String str)
		-> 会将字符串中所有大写字母转小写，其余不变, 返回新字符串；

	2. Character.toLowerCase(char c)
		-> 如果该字符是大写字母，将会被转为小写字母，否则保持不变，返回新字符；

	3. str.toCharArray()
		-> 将str按照每个字符，按顺序分割为charArray，返回新charArray;

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        char[] inputArray;
        char target;
        int counter = 0;
        while (input.hasNext()) {
            inputArray = input.nextLine().toLowerCase().toCharArray();
            target = Character.toLowerCase(input.next().charAt(0));
            for (char c:inputArray) {
                if (target == c) {
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
        }
    }
}

```

### [Testing]

```

输入

ABCDEF
A

输出

1

```