# 字符串分割

### [Source: HUA WEI]

### [Problem Description]
	
	•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
	•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。 

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	连续输入字符串(输入2次,每个字符串长度小于100)

	输出描述:
	输出到长度为8的新字符串数组

### [Design]
	
	1. 计算是否字符串可以被8整除，即判断最后一个被分割下来的字符串需不需要补'0'；
	2. 如果需要补'0'，计算需要补的个数，然后直接添加到未分割的字符串末尾；
	3. 以8为间隔分割字符串；

### [Note]

	1. 分割字符串方法：
		str.substring(a)
			-> 截取从index a 到 末尾的整个字符串，包含a，返回新字符串；
		str.substring(a, b)
			-> 截取从index a 到 index b的整个字符串，包含a不包含b，返回新字符串；

	2. scanner.nextInt() 不会跳转到下一行，记得手动用 scanner.nextLine()跳转；

	3. scanner.next() 会自动跳转到下一行；

	4. 读取下一个字符：
		scanner.next().charAt(0);

	5. 补充：scanner.next() 和 scanner.nextLine()的区别：
		input stream = "hello world"
		// 用scanner.next()连续System.out.print需要打印两次
			->
			helloworld
		// 用scanner.nextLine()System.out.print只用打印一次
			->
			hello world

		简单来说，基本运行效果相同，但是next不会读取后面的空格；next遇到空格会停止，但是nextLine会读取整行内容直到遇到换行符；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {

    public static void printSubstrings(String str) {
        int leftNums = str.length()%8;
        int fixLoopTimes = 0;
        if (leftNums != 0) {
            fixLoopTimes = 8 - leftNums;
        }
        for (int i = 0; i < fixLoopTimes; i++) {
            str += "0";
        }
        int loopTimes = str.length()/8;
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(str.substring(i*8, i*8+8));
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str_1 = input.nextLine();
            String str_2 = input.nextLine();
            printSubstrings(str_1);
            printSubstrings(str_2);
        }
    }
}

```

### [Testing]

```

输入

abc
123456789

输出

abc00000
12345678
90000000

```