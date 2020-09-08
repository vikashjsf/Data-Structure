package com.problem.soving01;

import java.util.Arrays;

public class PDutchNationalFlagAlgo {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 1, 2, 1, 0, 1, 0, 2, 1, 1, 2, 0 };
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		dutchNationalFlagAlgoritham(arr);
		System.out.println("After Sorting  : "+Arrays.toString(arr));
	}
	
	public static void dutchNationalFlagAlgoritham(int[]arr) {
		int low=0;
		int mid=0;
		int high = arr.length-1;
		
		while(mid <= high) {
			int num = arr[mid];
			switch (num) {
			case 0:
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp1 = arr[high];
				arr[high] = arr[mid];
				arr[mid]=temp1;
				high--;
				break;
			default:
				break;
			}
		}
	}
}
