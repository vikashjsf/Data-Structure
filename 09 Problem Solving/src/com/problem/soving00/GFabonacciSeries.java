//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
package com.problem.soving00;

public class GFabonacciSeries {
	public static void main(String[] args) {
		int toNum = 100;
		printFabonacciSeries(toNum);
	}
	
	public static void printFabonacciSeries(int toNum) {
		int first = 0;
		int second = 1;
		int next = 0;
		System.out.print(first + " " + second + " ");

		for (int i = 1; i <= toNum; i++) {
			next = first + second;
			if (next >= toNum) {
				break;
			}
			System.out.print(next + " ");
			first = second;
			second = next;
		}
	}
}
