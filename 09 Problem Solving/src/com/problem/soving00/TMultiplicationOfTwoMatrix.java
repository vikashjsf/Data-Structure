//Multiplication of two matrix
package com.problem.soving00;

public class TMultiplicationOfTwoMatrix {
	public static void main(String[] args) {
		int row1 = 2, column1 = 3;
		int row2 = 3, column2 = 2;
		int[][] firstMatrix = { { 3, -2, 5 }, { 3, 0, 4 } };
		int[][] secondMatrix = { { 2, 3 }, { -9, 0 }, { 0, 4 } };
		
		if (column1 == row2) {
			int[][] product = new int[row1][column2];
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					for (int k = 0; k < column1; k++) {
						product[i][j] = product[i][j] + firstMatrix[i][k] * secondMatrix[k][j];
					}
				}
			}
		} else {
			System.out.println("Multiplication not possible!!");
		}
	}
}

/*

 the number of columns in the first matrix must be equal to the number of 
 	rows in the second matrix. 

*/
