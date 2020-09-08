package com.problem.soving01;

import java.util.Arrays;

public class OReverseArray {
	public static void main(String[] args) {
		int[] inputArray = { 1, 2, 3, 4, 5,6 };
		System.out.println("1. Input Array is :" + Arrays.toString(inputArray));
		reverseArrayIterative(inputArray);
		String reverseArray = Arrays.toString(inputArray);
		System.out.println("2. Iterative method - reverse array :" + reverseArray);
	}

	//Time Complexity : O(n/2)
	public static void reverseArrayIterative(int[] arr) {
		int size = arr.length;
		int temp;
		for (int i = 0; i < size/2; i++) {
			temp = arr[i];
			arr[i] = arr[size-1-i];
			arr[size-1-i]=temp;
		}
	}
}
