//Find the two max number in the given arrays
package com.problem.soving00;

import java.util.Arrays;

public class YTwoMaxNumber {
	public static void main(String[] args) {
		int[] arr = {70,20,30,15,5,45,25,100};
		maxtownumber(arr);
		//maxtownumber1(arr);
	}

	public static void maxtownumber(int[] arr) {
		int maxOne = Integer.MIN_VALUE;
		int maxTwo = Integer.MIN_VALUE;
		for (int num : arr) {
			if (maxOne < num) {
				maxTwo = maxOne;
				maxOne = num;
			} else if (maxTwo < num) {
				maxTwo = num;
			}
		}
		System.out.println("First Max Number: " + maxOne);
		System.out.println("Second Max Number: " + maxTwo);
	}
	
	public static void maxtownumber1(int[] arr) {
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
		 System.out.println("Second Highest Number:"+arr[arr.length-2]);
	}
}
