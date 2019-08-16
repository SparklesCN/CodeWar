# 提取不重复的整数

### [Source: HUA WEI]

### [Problem Description]
	
	输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。


### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	输入一个int型整数

	输出描述:
	按照从右向左的阅读顺序，返回一个不含重复数字的新的整数


### [Design]
	
	1. ArrayList按照顺序记录下所有出现过的不重复的字符；
	2. HashMap记录和更新，以字符为key，出现次数为value；
	3. 按照顺序，在HashMap中查询ArrayList对应的key的value；仅打印出现次数为1的key；

### [Note]

	None；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            printNoRepeatInt(scanner.nextInt());
        }
    }
    
    public static void printNoRepeatInt(int num) {
        String numStr = Integer.toString(num);
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        ArrayList<Character> resArrayList = new ArrayList<Character>();
        for (int i = numStr.length() - 1; i >= 0; i--) {
            if (!map.containsKey(numStr.charAt(i))) {
                map.put(numStr.charAt(i), 1);
                resArrayList.add(numStr.charAt(i));
            }
        }
        String resStr = "";
        for (int i = 0; i < resArrayList.size(); i++) {
            resStr += resArrayList.get(i);
        }
        System.out.println(Integer.parseInt(resStr));
        
    }
}

```

### [Testing]

```

输入

9876673

输出

37689

```