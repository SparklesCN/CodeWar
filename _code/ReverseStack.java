import java.io.*;
import java.util.*;

public class ReverseStack {

	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		}
		else {
			int lastElement = getAndRemoveLastElement(stack);
			stack.push(result);
			return lastElement;
		}
	}

	public static void reverseStack(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		else {
			int temp = getAndRemoveLastElement(stack);
			reverseStack(stack);
			stack.push(temp);
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		// original stack 
		String values = Arrays.toString(stack.toArray());
		System.out.print("Current Stack Bottom->Top ");
		System.out.println(values);

		// test for getAndRemoveLastElement
		getAndRemoveLastElement(stack);
		values = Arrays.toString(stack.toArray());
		System.out.print("Current Stack Bottom->Top ");
		System.out.println(values);

		// test for reverseStack
		reverseStack(stack);
		values = Arrays.toString(stack.toArray());
		System.out.print("Current Stack Bottom->Top ");
		System.out.println(values);

		// test for push
		stack.push(1);
		values = Arrays.toString(stack.toArray());
		System.out.print("Current Stack Bottom->Top ");
		System.out.println(values);
	}
}