import java.util.*;
import java.io.*;

public class Main {

	/*
	@param
		int N : avaliable position 1 ~ N
		int M : current position for robot
		int K : rest steps
		int P : target position

	@return
		None
	*/
	public static int walkWaysForce (int N, int M, int K, int P) {
		// base case
		// if K == 0, no step left
		if (K == 0) {
			return M == P ? 1 : 0;
		}
		// if M == 1, only able to move right;
		if (M == 1) {
			return walkWaysForce(N, M+1, K-1, P);
		}
		// if M == N, only able to move left;
		if (M == N) {
			return walkWaysForce(N, M-1, K-1, P);
		}
		// norm case
		// if 1 < M < N, M free to move left or right;
		else {
			return walkWaysForce(N, M-1, K-1, P) + walkWaysForce(N, M+1, K-1, P);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the Length of The Way?");
		int N = scanner.nextInt();
		System.out.println("What is the start position for Robot?");
		int M = scanner.nextInt();
		System.out.println("How many steps the robot could move?");
		int K = scanner.nextInt();
		System.out.println("Which position is the Target?");
		int P = scanner.nextInt();
		System.out.println("-------------------------------------------------------------");
		System.out.println("There is totally <" + walkWaysForce(N, M, K, P) + "> ways to head in Target -- walkWaysForce");
		scanner.close();
	}

}