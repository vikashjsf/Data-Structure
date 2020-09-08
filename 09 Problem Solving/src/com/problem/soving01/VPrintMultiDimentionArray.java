package com.problem.soving01;

import java.util.Arrays;

public class VPrintMultiDimentionArray {
	public static void main(String[] args) {
		// Static initialization
		System.out.println("1. ******Static initialization of arrays*******");
		int staticOneDimension[] = { 1, 2, 3, 4, 5 };

		System.out.println("One Dimension array : " + Arrays.toString(staticOneDimension));
		int staticTwoDimension[][] = { { 10, 20 }, { 100, 200 }, { 1000, 2000 } };
		System.out.println("Two Dimension array : " + Arrays.deepToString(staticTwoDimension));

		int staticThreeDimension[][][] = { { { 10, 20, 30 }, }, { { 100, 200, 300 }, }, { { 1000, 2000, 3000 } } };
		System.out.println("Three Dimension array : " + Arrays.deepToString(staticThreeDimension));

		System.out.println("2. ******Dynamic initialization of arrays*******");
		int oneDimension[] = new int[4];
		for (int index = 0; index < oneDimension.length; index++)
			oneDimension[index] = index * index;

		System.out.println("One Dimension array : " + Arrays.toString(oneDimension));
		int matrix[][] = new int[3][3];
		for (int row = 0; row < matrix.length; row++)
			for (int col = 0; col < matrix.length; col++)
				matrix[row][col] = row * col;

		System.out.println("Two Dimension array : " + Arrays.deepToString(matrix));

		int xyzSpace[][][] = new int[2][3][2];
		for (int x = 0; x < xyzSpace.length; x++)
			for (int y = 0; y < xyzSpace.length; y++)
				for (int z = 0; z < xyzSpace.length; z++)
					xyzSpace[x][y][z] = x * y * z;

		System.out.println("Three Dimension array : " + Arrays.deepToString(xyzSpace));
	}
}
