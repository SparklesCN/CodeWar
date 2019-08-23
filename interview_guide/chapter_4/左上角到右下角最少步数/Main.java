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

	public static int shortestPathFoo(int M, int N, int[][] weightGraph, int x, int y, int[][] record) {
		if (record[x][y] != -1) {
			return record[x][y];
		}
		// base case
		// if (x, y) is the right bottom corner;
		if (x == M - 1 && y == N - 1) {
			record[x][y] = weightGraph[M-1][N-1];
			return record[x][y];
		}
		// if (x, y) in last row, only able to move right;
		else if (x == M - 1) {
			record[x][y] = weightGraph[x][y] + shortestPathForce(M, N, weightGraph, x, y + 1);
			return record[x][y];
		}

		// if (x, y) in last col, only able to move down;
		else if (y == N - 1) {
			record[x][y] = weightGraph[x][y] + shortestPathForce(M, N, weightGraph, x + 1, y);
			return record[x][y];
		}

		// norm case
		// if (x, y) not in last row or last col. just a norm position
		else {
			record[x][y] = weightGraph[x][y] + Math.min(shortestPathForce(M, N, weightGraph, x + 1, y), shortestPathForce(M, N, weightGraph, x, y + 1));
			return record[x][y];
		}
	}

	public static void main(String[] args) {
		// test shortestPathForce
		int[][] weightGraph = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
		System.out.println(shortestPathForce(4, 4, weightGraph, 0, 0));
		
		// test shortestPathFoo
		// init record 
		int[][] record = new int[weightGraph.length][weightGraph[0].length];
		for (int i = 0; i < record.length; i++) {
			for (int j = 0; j < record[0].length; j++) {
				record[i][j] = -1;
			}
		}
		System.out.println(shortestPathFoo(4, 4, weightGraph, 0, 0, record));

		// test shortestPathDP
	}
}