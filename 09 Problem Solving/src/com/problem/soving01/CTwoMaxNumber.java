//Find the two max number in the given arrays
package com.problem.soving01;

import java.util.Arrays;

public class CTwoMaxNumber {
	public static void main(String[] args) {
		int[] arr = {70,20,30,15,5,45,25,100};
		maxtownumber(arr);
		maxtownumber1(arr);
	}

	public static void maxtownumber(int[] arr) {
		int maxOne = 0;
		int maxTwo = 0;
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
