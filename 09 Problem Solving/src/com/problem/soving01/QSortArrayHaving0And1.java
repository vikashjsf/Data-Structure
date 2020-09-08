package com.problem.soving01;

import java.util.Arrays;

public class QSortArrayHaving0And1 {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 };
		System.out.println("Before Sorting : "+Arrays.toString(arr));
		sortArrayHaving0And1(arr);
		System.out.println("After Sorting  : "+Arrays.toString(arr));
	}
	
	public static void sortArrayHaving0And1(int arr[]) {
		int low =0;
		int high =arr.length-1;
		int num=0;
		while(low <= high) {
			num = arr[low];
			switch (num) {
			case 0:
				low++;
				break;
			case 1:
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high]=temp;
				high--;
				break;
			default:
				break;
			}
		}
		
	}
}
