package com.problem.soving01;

import java.util.Arrays;

public class RSegregateEvenAndOdd {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 20, 31, 50, 61, 90 };
		System.out.println("Before  : "+Arrays.toString(arr));
		segregateEvenAndOdd(arr);
		System.out.println("After   : "+Arrays.toString(arr));
	}

	public static void segregateEvenAndOdd(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int num = 0;
		while (low <= high) {
			num = arr[low] % 2;
			switch (num) {
			case 0:
				low++;
				break;
			case 1:
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				high--;
				break;
			default:
				break;
			}
		}
	}
}
