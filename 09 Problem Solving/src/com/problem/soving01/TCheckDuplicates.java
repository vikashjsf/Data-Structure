package com.problem.soving01;

public class TCheckDuplicates {

	public static void main(String[] args) {
		int[] array = { 2, 1, 5, 4, 2, 3, 1 };
		isDuplicate(array);

		array = new int[] { 2, 1, 3, 3, 4 };
		isDuplicate(array);
	}
	
	private static void isDuplicate(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int absIndex = Math.abs(arr[i]);
			if (arr[absIndex] < 0) {
				// We have already seen this number
				System.out.println("1. Duplicate number exist in array at index : " + i);
				return;
			} else { // We are seeing this number for first time
				arr[absIndex] = -arr[absIndex];
			}
		}
		System.out.println("2. No duplicate element exists in an array");
		return;
	}
}
