# 查找兄弟单词

### [Source: HUA WEI]

### [Problem Description]
	
	https://www.nowcoder.com/practice/03ba8aeeef73400ca7a37a5f3370fe68?tpId=37&tqId=21250&tPage=2&rp=&ru=/ta/huawei&qru=/ta/huawei/question-ranking

### [Difficulty: EASY]

### [Problem Requirnment]

	输入描述:
	先输入字典中单词的个数n，再输入n个单词作为字典单词。
	再输入一个单词，查找其在字典中兄弟单词的个数m
	再输入数字k

	输出描述:
	根据输入，输出查找到的兄弟单词的个数m
	然后输出查找到的兄弟单词的第k个单词。

### [Design]
	
	主要难点在于如何判断兄弟单词；
	1. 不可以是完全相同单词；
	2. 兄弟单词与原单词长度必定相等
	3. 兄弟单词在重新字典序排序后，和原单词在重新字典序排序后，必定完全相同；

### [Note]

	Type : String .equals(Type : String) -> boolean
	判断字符串内容是否相同，不可使用“==”，必需使用以上方程；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int wordsNum = scanner.nextInt();
            String[] dict = new String[wordsNum];
            for (int i = 0; i < wordsNum; i++) {
                dict[i] = scanner.next();
            }
            String target = scanner.next();
            int brotherIndex = scanner.nextInt();
            process(dict, target, brotherIndex);
            scanner.nextLine();
        }
    }
    
    public static void process(String[] dict, String target, int brotherIndex) {
        ArrayList<String> list = new ArrayList<>();
        Arrays.sort(dict);
        for (String cur : dict) {
            if (isBrother(target, cur)) {
                list.add(cur);
            }
        }
        System.out.println(list.size());
        if (brotherIndex <= list.size() && list.size() > 0) {
            System.out.println(list.get(brotherIndex - 1));
        }
    }
    
    public static boolean isBrother(String target, String cur) {
        // target can not same as cur
        if (target.equals(cur)) {
            return false;
        }
        // length must be same
        if (target.length() != cur.length()) {
            return false;
        }
        // norm case
        char[] targetArray = target.toCharArray();
        char[] curArray = cur.toCharArray();
        // sortted array must be same
        Arrays.sort(targetArray);
        Arrays.sort(curArray);
        for (int i = 0; i < curArray.length; i++) {
            if (targetArray[i] != curArray[i]) {
                return false;
            }
        }
        return true;
    }
}

```

### [Testing]

```

输入

3 abc bca cab abc 1

输出

2
bca

```