package com.print.pattern;

public class CPyramidUsingStar {
	public static void main(String[] args) {
		pyramidUsingStart();
		System.out.println("###############");
		pyramidUsingStartUsingWhileLoop();
	}
	//Using four for loop 
		public static void pyramidUsingStart() {
			 int rows = 5;
			 for (int i = 1; i <=rows ; i++) {
				for (int j = 1; j <= rows-i; j++) {
					//Printing Space
					System.out.print(" ");
				}
				for (int j = 1; j <= i ; j++) {
					/*Printing left start
					
						    *
						   **
						  ***
						 ****
						*****
					*/
					System.out.print("*"+"");
				}
				//Rest of the right star
				/*
					*
					**
					***
					****
				*/
				for (int j = 1; j <= i-1 ; j++) {
					System.out.print("*");
				}
				//for new lines
				System.out.println();
			}
		}
		
		public static void pyramidUsingStartUsingWhileLoop() {
			int rows = 5;
			int k = 0;
			for (int i = 1; i <= rows ; i++ ,k=0) {
				for (int j = 1; j <= rows -i; j++) {
					System.out.print(" ");
				}
				
				while(k != 2 * i-1) {
					System.out.print("*");
					k++;
				}
				System.out.println();
			}
		}
}
