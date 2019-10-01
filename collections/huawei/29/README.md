# 字符串加解密

### [Source: HUA WEI]

### [Problem Description]
	
	1、对输入的字符串进行加解密，并输出。

	2加密方法为：

	当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；

	当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；

	其他字符不做变化。

	3、解密方法为加密的逆过程。

 

	接口描述：

	    实现接口，每个接口实现1个基本操作：

	void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出

	说明：

	1、字符串以\0结尾。

	2、字符串最长100个字符。

	 

	int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出

	说明：

	1、字符串以\0结尾。

    2、字符串最长100个字符。

### [Difficulty: EASY]

### [Problem Requirnment]
		
	输入描述:

	输入说明
	输入一串要加密的密码
	输入一串加过密的密码

	输出描述:

	输出说明
	输出加密后的字符
	输出解密后的字符


### [Design]
	
	加密解密每个字符对应的字符是固定的，所以可以直接列出，更便利；

### [Note]

	None;

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String decrypted = scanner.nextLine();
            String encrypted = scanner.nextLine();
            encrypte(decrypted);
            decrypte(encrypted);
        }
    }
    
    public static void encrypte (String input) {
        String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String str2="bcdefghijklmnopqrstuvwxyzaBCDEFGHIJKLMNOPQRSTUVWXYZA1234567890";
        StringBuffer sBuffer = new StringBuffer();
        for (char c : input.toCharArray()) {
            if (str1.indexOf(c) >= 0) {
                sBuffer.append(str2.charAt(str1.indexOf(c)));
                continue;
            }
            sBuffer.append(c);
        }
        System.out.println(sBuffer);
    }
    
    public static void decrypte (String input) {
        String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String str2="bcdefghijklmnopqrstuvwxyzaBCDEFGHIJKLMNOPQRSTUVWXYZA1234567890";
        StringBuffer sBuffer = new StringBuffer();
        for (char c : input.toCharArray()) {
            if (str2.indexOf(c) >= 0) {
                sBuffer.append(str1.charAt(str2.indexOf(c)));
                continue;
            }
            sBuffer.append(c);
        }
        System.out.println(sBuffer);
    }
}

```

### [Testing]

```

输入

abcdefg
BCDEFGH

输出

BCDEFGH
abcdefg

```