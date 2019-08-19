import java.util.*;
import java.io.*;

public class Main {

	public static int[] insertSort(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (intArray[j] < intArray[j-1]) {
					intArray = swap (j, j-1, intArray);
				}
			} 
			
		}
		return intArray;
	}

	public static int[] swap (int a, int b, int[] intArray) {
		int temp = intArray[a];
		intArray[a] = intArray[b];
		intArray[b] = temp;
		return intArray;
    }
    
    public static void main(String[] args) {
		int[] array = {5, 3, 0, 2 ,1 ,4, -1};
		System.out.println(Arrays.toString(array));
		array = insertSort(array);
        System.out.println(Arrays.toString(array));
	}

}