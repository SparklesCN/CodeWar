import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		foo(array);
		System.out.println(Arrays.toString(array));
	}
	public static void foo (int[] a) {
		a[0] = 0;
	}
} 