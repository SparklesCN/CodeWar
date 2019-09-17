# 简单密码

### [Source: HUA WEI]

### [Problem Description]
	
	密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈. 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。

 

	假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。

	 

	他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，

	 

	声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:

	输入包括多个测试数据。输入是一个明文，密码长度不超过100个字符，输入直到文件结尾

	输出描述:

	输出渊子真正的密文

### [Design]
	
	这题有一个讨巧的方法，每个字符对应的加密后符号都是固定的，所以做一个HashTable去链接对应关系即可；

### [Note]

	None;

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(decodePassword(scanner.nextLine()));
        }
    }
    
    public static String decodePassword (String str) {
        Map<Character, Character> lowerCaseMap = new HashMap<Character, Character>();
        char[] charArray = str.toCharArray();
        lowerCaseMap.put('a', '2');
        lowerCaseMap.put('b', '2');
        lowerCaseMap.put('c', '2');
        lowerCaseMap.put('d', '3');
        lowerCaseMap.put('e', '3');
        lowerCaseMap.put('f', '3');
        lowerCaseMap.put('g', '4');
        lowerCaseMap.put('h', '4');
        lowerCaseMap.put('i', '4');
        lowerCaseMap.put('j', '5');
        lowerCaseMap.put('k', '5');
        lowerCaseMap.put('l', '5');
        lowerCaseMap.put('m', '6');
        lowerCaseMap.put('n', '6');
        lowerCaseMap.put('o', '6');
        lowerCaseMap.put('p', '7');
        lowerCaseMap.put('q', '7');
        lowerCaseMap.put('r', '7');
        lowerCaseMap.put('s', '7');
        lowerCaseMap.put('t', '8');
        lowerCaseMap.put('u', '8');
        lowerCaseMap.put('v', '8');
        lowerCaseMap.put('w', '9');
        lowerCaseMap.put('x', '9');
        lowerCaseMap.put('y', '9');
        lowerCaseMap.put('z', '9');
        for (int i = 0; i < charArray.length; i++) {
            char curChar = charArray[i];
            
            // lowercase char
            if (Character.isLowerCase(curChar)) {
                charArray[i] = lowerCaseMap.get(curChar);
            }
            // uppercase char
            else if (Character.isUpperCase(curChar)) {
                charArray[i] = Character.toLowerCase(curChar);
                int offset = charArray[i] - 'a';
                if (offset < 25) {
                    charArray[i]++;
                }
                else {
                    charArray[i] = 'a';
                }
            }
            // number & other signs
            else {
                continue;
            }
        }
        String res = "";
        for (int i = 0; i < charArray.length; i++) {
            res+=charArray[i];
        }
        return res;
    }
}

```

### [Testing]

```

输入

YUANzhi1987

输出

zvbo9441987

```