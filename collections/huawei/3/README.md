# 随机数去重和排序

### [Source: HUA WEI]

### [Problem Description]
	
	明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
---
	Input Param

	n               输入随机数的个数

	inputArray      n个随机整数组成的数组


	Return Value

	OutputArray    输出处理后的随机整数



	注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。

### [Difficulty: EASY]

### [Problem Requirnment]
	
	输入描述:
	输入多行，先输入随机整数的个数，再输入相应个数的整数

	输出描述:
	返回多行，处理后的结果

### [Design]
	
	1. 获取总随机数个数，得到循坏次数；
	2. 用HashSet存储所有随机数并完成去重工作；
	3. 将hashSet转换为array，然后对array进行排序；

### [Note]

	1. 建立一个HashSet:
		Set<Integer> hashSet = new HashSet<Integer>();

	2. 将hashSet转换为array:
		hashSet.toArray()
			-> 将hashSet变为对应类型array，返回新array；
	3. 排序一个array
		Arrays.sort(Object[] array)
			-> 直接排序输入array，直接覆盖原array, 不返回值；

	4. array转换为string
		Arrays.toString(Object[] array)
			-> 将array转换为string，返回新string；

	5. char转换为string
		Character.toString(char c)
			-> 将char转换为string，返回新string；

### [CodeWar]

```java

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int length = input.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            for (int i = 0; i < length; i++) {
                set.add(input.nextInt());
            }
            Object[] array = set.toArray();
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }  
        }
        
    }
}

```

### [Testing]

```

输入

11
10
20
40
32
67
40
20
89
300
400
15

输出

10
15
20
32
40
67
89
300
400

```