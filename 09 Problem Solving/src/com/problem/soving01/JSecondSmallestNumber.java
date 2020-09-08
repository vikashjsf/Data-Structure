package com.problem.soving01;

import java.util.Arrays;

public class JSecondSmallestNumber {
	public static void main(String[] args) {
		int[] arr = {70,20,30,15,5,45,25,100};
		secondSmallestNumber(arr);
		System.out.println("***************************");
		secondSmallestNumber1(arr);
	}

	public static void secondSmallestNumber1(int[] arr) {
		 int firstMax = Integer.MAX_VALUE;
		 int secondMax = Integer.MAX_VALUE;
		 for (int number : arr) {
			if( number < firstMax) {
				secondMax = firstMax;
				firstMax = number;
			}else if(number < secondMax) {
				secondMax = number;
			}
		}
		System.out.println("First Smallest number : "+firstMax);
		System.out.println("Second Smallest number : "+secondMax);
	}

	public static void secondSmallestNumber(int[] arr) {
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 System.out.println("First Smallest number : "+arr[0]);
		 System.out.println("Second Smallest number : "+arr[1]);
	}
}
