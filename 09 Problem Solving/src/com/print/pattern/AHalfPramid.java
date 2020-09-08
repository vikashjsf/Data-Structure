/*
Program to print half pyramid using *
*
* *
* * *
* * * *
* * * * *
*/
package com.print.pattern;

public class AHalfPramid {
	public static void main(String[] args) {
		halfPyramidUsingStar();
		System.out.println("*******");
		halfPyramidUsingNumber();
		System.out.println("********");
		halfPyramidUsingAlphabet();
	}
	
	public static void halfPyramidUsingStar() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+ " ");
			}
			System.out.println();
		}
	}
	
	public static void halfPyramidUsingNumber() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	
	public static void halfPyramidUsingAlphabet() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print (j + " ");
			}
			System.out.println();
		}
	}
	
	
}
