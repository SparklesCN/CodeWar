# 密码验证合格程序

### [Source: HUA WEI]

### [Problem Description]
	
	密码要求:

	1.长度超过8位

	2.包括大小写字母.数字.其它符号,以上四种至少三种	 

	3.不能有相同长度超2的子串重复

	说明:长度超过2的子串

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:

	一组或多组长度超过2的子符串。每组占一行

	输出描述:

	如果符合要求输出：OK，否则输出NG

### [Design]
	
	获取输入后，按条件依次判断即可；必需满足所有要求；
	灵活运用hashmap去判断查找；

### [Note]

	None;

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            if (isLegalPassword(scanner.nextLine())) {
                System.out.println("OK");
            }
            else {
                System.out.println("NG");
            }
        }
    }
    
    public static boolean isLegalPassword(String str) {
        // check length;
        if (str.length() < 9) {
            return false;
        }
        // check diffRequire
        Map<String, Integer> requireMap = new HashMap<String, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                if (!requireMap.containsKey("digit")) {
                    requireMap.put("digit", 1);
                }
                continue;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                if (!requireMap.containsKey("lowercase")) {
                    requireMap.put("lowercase", 1);
                }
                continue;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                if (!requireMap.containsKey("uppercase")) {
                    requireMap.put("uppercase", 1);
                }
                continue;
            }
            else {
                if (!requireMap.containsKey("sign")) {
                    requireMap.put("sign", 1);
                }
            }
        }
        // at least fit three requirements;
        if (requireMap.size() < 3) {
            return false;
        }
        // check same two substring length with 3;
        Map<String, Integer> repeatMap = new HashMap<String, Integer>();
        for (int i = 0; i < str.length() - 2; i++) {
            if (repeatMap.containsKey(str.substring(i, i+3))) {
                return false;
            }
            repeatMap.put(str.substring(i, i+3), 1);
        }
        return true;
    }
}

```

### [Testing]

```

输入

021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000

输出

OK
NG
NG
OK

```