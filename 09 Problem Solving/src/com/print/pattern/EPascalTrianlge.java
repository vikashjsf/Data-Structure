/*
Print Pascal's triangle
    	   1
         1   1
       1   2   1
     1   3   3    1
   1   4   6   4   1
 1   5   10   10  5   1
*/
package com.print.pattern;

public class EPascalTrianlge {
	public static void main(String[] args) {
		printPascalTriangle();
	}
	
	public static void printPascalTriangle() {
		int rows = 6;
		for (int i = 0; i <rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("@|");
			}

			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
