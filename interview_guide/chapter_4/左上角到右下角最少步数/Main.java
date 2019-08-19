import java.util.*;
import java.io.*;

public class Main {
	/*
	@params
		int M : row nums
		int N : col nums
		int[][] weightGraph : the weightGraph
		int x : start position's x coordinate
		int y : start position's y coordinate
	@return
		int : shortest path from (x, y) to right bottom corner
	*/

	public static int shortestPathForce(int M, int N, int[][] weightGraph, int x, int y) {
		// base case
		// if (x, y) is the right bottom corner;
		if (x == M - 1 && y == N - 1) {
			return weightGraph[M-1][N-1];
		}
		// if (x, y) in last row, only able to move right;
		else if (x == M - 1) {
			return weightGraph[x][y] + shortestPathForce(M, N, weightGraph, x, y + 1);
		}
		// if (x, y) in last col, only able to move down;
		else if (y == N - 1) {
			return weightGraph[x][y] + shortestPathForce(M, N, weightGraph, x + 1, y);
		}
		// norm case
		// if (x, y) not in last row or last col. just a norm position
		else {
			return weightGraph[x][y] + Math.min(shortestPathForce(M, N, weightGraph, x + 1, y), shortestPathForce(M, N, weightGraph, x, y + 1));
		} 
	}

	public static void main(String[] args) {
		int[][] weightGraph = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
		System.out.println(shortestPathForce(4, 4, weightGraph, 0, 0));
	}

}