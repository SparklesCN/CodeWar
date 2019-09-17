# 删除字符串中出现次数最少的字符

### [Source: HUA WEI]

### [Problem Description]
	
	实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。 

### [Difficulty: EASY]

### [Problem Requirnment]
		
	输入描述:

	字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。

	输出描述:

	删除字符串中出现次数最少的字符后的字符串。

### [Design]
	
	记录下所有字符出现次数；
	查找到最小的出现次数；
	删除所有符合最小出现次数的字符；

### [Note]

	String s1="javatpoint is a very good website";  
	String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  

	-> "jevetpoint is e very good website"

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            getNewStr(scanner.nextLine());
        }
    }
    
    public static void getNewStr(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
                list.add(c);
                continue;
            }
            map.put(c, map.get(c)+1);
        }
        int minOccur = Integer.MAX_VALUE;
        for (char c : list) {
            if (map.get(c) <= minOccur) {
                minOccur = map.get(c);
            }
        }
        ArrayList<Character> removeList = new ArrayList<>();
        for (char c : list) {
            if (map.get(c) == minOccur) {
                input = input.replace(c+"", "");
            }
        }
        //System.out.println(minOccur);
        //System.out.println(removeList.toString());
        System.out.println(input);
        
    }
}

```

### [Testing]

```

输入

abcdd

输出

dd

```