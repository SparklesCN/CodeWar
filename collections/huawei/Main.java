/*
1. 每个人都可作为中间的那个
2. 查询每个人作为中间人时候左边符合的个数和右边符合的个数
3. 左边+右边+自己（1）最大的那个，就是最多人符合的情况
4. 所以总人数-最多人符合的情况=最少出列人数
*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int stuNum = scanner.nextInt();
            int[] array = new int[stuNum];
            for (int i = 0; i < stuNum; i++) {
                array[i] = scanner.nextInt();
            }
            minOutMatch(array);
        }
    }

    public static void minOutMatch(int[] array) {
        int[] leftMatchArray = new int[array.length];
        int[] rightMatchArray = new int[array.length];
        // count valid num students in left
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] > array[j] && leftMatchArray[i] < leftMatchArray[j]) {
                    leftMatchArray[i] = leftMatchArray[j] + 1;
                }
            }
        }

        // reverse to prepare for count right
        array = reverse(array, array,length);

        // count valid num students in right
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] > array[j] && rightMatchArray[i] < rightMatchArray[j]) {
                    rightMatchArray[i] = rightMatchArray[j] + 1;
                }
            }
        }

        int max = 0;
        int allMatch = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = leftMatchArray[i] + rightMatchArray[j];
            allMatch = Math.max(temp, allMatch);
        }

        // res
        System.out.println(array.length - max - 1);
    }

    /* function that reverses array and stores it  
       in another array*/
    static int[] reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        return b; 
    } 
}