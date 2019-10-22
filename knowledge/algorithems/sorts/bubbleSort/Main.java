import java.util.*;
import java.io.*;

public class Main {

    public static void bubbleSort(int[] inputArray) {
        for (int end = inputArray.length - 1; end > 0; end--) {
            for (int pointer = 0; pointer < end; pointer++) {
                if (inputArray[pointer] > inputArray[pointer+1]) {
                    swap(inputArray, pointer, pointer+1);
                }
            }
        }
    }

    public static void swap(int[] inputArray, int indexA, int indexB) {
        int temp = inputArray[indexA];
        inputArray[indexA] = inputArray[indexB];
        inputArray[indexB] = temp;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 0, 2 ,1 ,4, -1};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}