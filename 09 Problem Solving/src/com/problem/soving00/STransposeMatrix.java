//Transpose of matrix
package com.problem.soving00;

public class STransposeMatrix {
	public static void main(String[] args) {
		 int row = 2, column = 3;
	     int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
	     System.out.println("Given Matrix ");
	     display(matrix);
	     System.out.println("After Transpose");
	     int[][] transpose = transpose(matrix, row, column);
	     display(transpose);
	}
	
	public static void display(int[][] matrix) {
		for (int[] rows : matrix) {
			for (int column : rows) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] transpose(int [][] matric ,int row , int column){
		int [][] transpose = new int[column][row];
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < column; j++) {
				transpose[j][i] = matric[i][j];
			}
		}
		return transpose;
		
	}
}
