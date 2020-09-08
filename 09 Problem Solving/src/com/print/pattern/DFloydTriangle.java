/*
Print below FloydTriable
1
2 3
4 5 6
7 8 9 10
*/

package com.print.pattern;

public class DFloydTriangle {
	public static void main(String[] args) {
		floyTriangle();
	}
	
	public static void floyTriangle() {
		int rows = 4;
		int count = 0; 
		for (int i = 1; i <= rows ; i++) {
			for (int j = 1; j <= i ; j++) {
				++count;
				System.out.print(count+ " ");
			}
			System.out.println();
		}
	}
}
