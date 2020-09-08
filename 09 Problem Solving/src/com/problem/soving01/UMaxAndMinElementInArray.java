package com.problem.soving01;

public class UMaxAndMinElementInArray {
	public static void main(String[] args) {
		int arr[] = { 5, 10, 40, 35, 20 };
		maxAndMinElementInArray(arr);
	}
	
	public static void maxAndMinElementInArray(int[] arr) {
		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;
		for (int num : arr) {
			if(num > maxNum)
				maxNum=num;
			if(num < minNum)
				minNum=num;
		}
		System.out.println("maxNum:"+maxNum);
		System.out.println("minNum:"+minNum);
	}
}
