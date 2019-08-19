import java.util.*;
import java.io.*;

public class Main {

    public static int[] bubbleSort(int[] intArray) {
        for (int end = intArray.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (intArray[i] > intArray[i+1]) {
                    intArray = swap (i, i+1, intArray);
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
		array = bubbleSort(array);
        System.out.println(Arrays.toString(array));
	}
}