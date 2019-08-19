import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		sb.insert(3, "d");
		System.out.println(sb);
	}
}