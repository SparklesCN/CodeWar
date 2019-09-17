# 坐标移动

### [Source: HUA WEI]

### [Problem Description]
	
	开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。

 

	输入：

	 

	合法坐标为A(或者D或者W或者S) + 数字（两位以内）

	 

	坐标之间以;分隔。

	 

	非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。

	 

	下面是一个简单的例子 如：

	 

	A10;S20;W10;D30;X;A1A;B10A11;;A10;

	 

	处理过程：

	 

	起点（0,0）

	 

	+   A10   =  （-10,0）

	 

	+   S20   =  (-10,-20)

	 

	+   W10  =  (-10,-10)

	 

	+   D30  =  (20,-10)

	 

	+   x    =  无效

	 

	+   A1A   =  无效

	 

	+   B10A11   =  无效

	 

	+  一个空 不影响

	 

	+   A10  =  (10,-10)

	 

	结果 （10， -10）

### [Difficulty: MEDIUM]

### [Problem Requirnment]
	
	输入描述:

	一行字符串

	输出描述:

	最终坐标，以,分隔

### [Design]
	
	1. 首先获取所有输入，以’；‘分割为一个array；
	2. 依次判断是否是合法输入
		（仅有以下两种可能性为合法输入，因为数字限定为两位以内）
		a. 长度为2位
		b. 长度为3位
	3. 重新遍历，如果为合法操作，按照第一位的字符进行处理计算；

### [Note]

	1. Type : String .substring(Type : int) 方法：
		
		String blogName = "howtodoinjava.com";
 
        System.out.println(blogName.substring(3));  //todoinjava.com
         
        System.out.println("hello world".substring(6)); //world

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            getLastPosition(scanner.nextLine());
        }
    }
    
    public static void getLastPosition(String input) {
        String[] strArray = input.split(";");
        int[] curPos = {0, 0};
        int operationNum = 0;
        String curOperation = "";
        
        for (int i = 0; i < strArray.length; i++) {
            curOperation = strArray[i];
            if (!isOperationLegal(strArray[i])) {
                strArray[i] = "invalid";
            }
        }
        
        for (int i = 0; i < strArray.length; i++) {
            curOperation = strArray[i];
            if (curOperation.equals("invalid")) {
                operationNum = 0;
                continue;
            }
            // do operation
            // getNum
            if (curOperation.length() == 2) {
                operationNum = Integer.parseInt(curOperation.substring(curOperation.length()-1));
            }
            else if (curOperation.length() == 3) {
                operationNum = Integer.parseInt(curOperation.substring(curOperation.length()-2));
            }
            // getOperation
            /* // Will have bug if use switch
            switch (curOperation.charAt(0)) {
                case 'A':
                    curPos[0] -= operationNum;
                case 'D':
                    curPos[0] += operationNum;
                case 'W':
                    curPos[1] += operationNum;
                case 'S':
                    curPos[1] -= operationNum;
            }
            */
            if (curOperation.charAt(0) == 'A') {
                curPos[0] -= operationNum;
            }
            else if (curOperation.charAt(0) == 'D') {
                curPos[0] += operationNum;
            }
            else if (curOperation.charAt(0) == 'W') {
                curPos[1] += operationNum;
            }
            else if (curOperation.charAt(0) == 'S') {
                curPos[1] -= operationNum;
            }
        }
        System.out.println(curPos[0] + "," + curPos[1]);
    }
    
    public static boolean isOperationLegal(String str) {
        if (str.length() == 2) {
            if (!(Character.isLowerCase(str.charAt(0)) || Character.isUpperCase(str.charAt(0)))) {
                return false;
            }
            if (Character.isDigit(str.charAt(1))) {
                return true;
            }
        }
        else if (str.length() == 3) {
            if (!(Character.isLowerCase(str.charAt(0)) || Character.isUpperCase(str.charAt(0)))) {
                return false;
            }
            if (!Character.isDigit(str.charAt(1))) {
                return false;
            }
            if (Character.isDigit(str.charAt(2))) {
                return true;
            }
        }
        return false;
    }
}

```

### [Testing]

```

输入

A10;S20;W10;D30;X;A1A;B10A11;;A10;

输出

10,-10

```