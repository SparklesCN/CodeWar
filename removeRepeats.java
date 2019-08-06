import java.io.*;
import java.util.*;

public class removeRepeats {

	public static String removeRepeat (String input) {
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (map.containsKey(inputArray[i])) {
				continue;
			}
			else {
				map.put(inputArray[i], i);
				counter++;
			}
		}
		char[] resultArray = new char[counter];
		int innerCounter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (map.get(inputArray[i]) == i) {
				resultArray[innerCounter++] = inputArray[i];
			}
			else {
				continue;
			}
		}
		String result = new String(resultArray);
		return result;
	}

	public static void main(String[] args) {
		String test_1 = "abacbd";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_1));
		System.out.println("should be: abcd");

		String test_2 = "abc";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_2));
		System.out.println("should be: abc");

		String test_3 = "aaa";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_3));
		System.out.println("should be: a");

		String test_4 = "aabbccdd";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_4));
		System.out.println("should be: abcd");

		String test_5 = "12ere2";
		System.out.print("output is: ");
		System.out.println(removeRepeat(test_5));
		System.out.println("should be: 12er");
	}

}