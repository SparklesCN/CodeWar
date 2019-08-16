# 合并表记录

### [Source: HUA WEI]

### [Problem Description]
	
	数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	先输入键值对的个数
	然后输入成对的index和value值，以空格隔开

	输出描述:
	输出合并后的键值对（多行）

### [Design]
	
	1. 用ArrayList记录下每一次不重复的新的key值；
	2. 用HashMap记录和更新key值对应value的和；
	3. 将ArrayList用Collections.sort()排序；
	4. 按顺序从小到大，升序打印出对应的HashMap中key所对应的value;

### [Note]

	None

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int loopTimes = scanner.nextInt();
            ArrayList<Integer> keysArrayList = new ArrayList<Integer>();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < loopTimes; i++) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                if (map.containsKey(num1)) {
                    map.put(num1, map.get(num1) + num2);
                }
                else {
                    map.put(num1, num2);
                    keysArrayList.add(num1);
                }
            }
            Collections.sort(keysArrayList);
            for (int key:keysArrayList) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}

```

### [Testing]

```

输入

4
0 1
0 2
1 2
3 4

输出

0 3
1 2
3 4

```