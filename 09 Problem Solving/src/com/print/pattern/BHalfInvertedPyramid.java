//Inverted half pyramid using *
/*
 
* * * * *
* * * *
* * * 
* *
*

*/
package com.print.pattern;

public class BHalfInvertedPyramid {
	public static void main(String[] args) {
		halfInvertedPyramidUsingStar();
		System.out.println("*******");
		halfInvertedPyramidUsingNumber();
	}
	
	public static void halfInvertedPyramidUsingStar() {
		int rows = 5;
		for (int i = rows; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}
	
	public static void halfInvertedPyramidUsingNumber() {
		 int rows = 5;
		 for (int i = rows; i >=0 ; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
