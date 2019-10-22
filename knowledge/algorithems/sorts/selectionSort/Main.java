// import java.util.*;
// import java.util.*;

// public class Main {
	
// 	public static int[] selectionSort(int[] intArray) {
// 		int minNum;
// 		int minIndex;
// 		for (int i = 0; i < intArray.length; i++) {
// 			minNum = intArray[i];
// 			minIndex = i;
// 			for (int j = i + 1; j < intArray.length; j++) {
// 				if (intArray[j] < minNum) {
// 					minNum = intArray[j];
// 					minIndex = j;
// 				}
// 			}
// 			intArray = swap(i, minIndex, intArray);
// 		}
// 		return intArray;
// 	}

// 	public static int[] swap (int a, int b, int[] intArray) {
// 		int temp = intArray[a];
// 		intArray[a] = intArray[b];
// 		intArray[b] = temp;
// 		return intArray;
// 	}

// 	public static void main(String[] args) {
// 		int[] array = {5, 3, 0, 2 ,1 ,4, -1};
// 		System.out.println(Arrays.toString(array));
// 		array = selectionSort(array);
// 		System.out.println(Arrays.toString(array));
// 	}
// }

import java.util.*;
import java.io.*;

public class Main {

	public static int[] selectionSort(int[] array) {
		for (int start = 0; start < array.length; start++) {
			int curMinIndex = start;
			for (int pointer = start; pointer < array.length; pointer++) {
				if (array[pointer] < array[curMinIndex]) {
					curMinIndex = pointer;
				}
			}
			array = swap (array, start, curMinIndex);
		}
		return array;
	}

	public static int[] swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
		return array;
	}

	public static void main(String[] args) {
		int[] array = {5, 3, 0, 2 ,1 ,4, -1};
		System.out.println(Arrays.toString(array));
		array = selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

}