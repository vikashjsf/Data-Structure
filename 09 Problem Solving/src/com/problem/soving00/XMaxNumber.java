// Find the  maximum of sum of two number of the given arrays.
package com.problem.soving00;
public class XMaxNumber {
	public static void main(String[] args) {
		int[] arr = {70,20,30,15,5,45,25};
		int max = maxNumber(arr);
		int max1 = sumOfTwoMax(arr);
		System.out.println("Max  Number : "+max );
		System.out.println("Max of number !! "+max1);
	}
	
	public static int maxNumber(int arr[]) {
		int sum=0;
		int max =0;
		for (int i = 0; i < arr.length; i++) {
			 for (int j = 1; j < arr.length; j++) {
				sum = arr[i]+arr[j];
				if(sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}
	
	public static int sumOfTwoMax(int arr[]) {
		int firstMax = 0 , secondMax = 0;
		for (int num : arr) {
			if(firstMax < num) {
				secondMax = firstMax;
				firstMax = num;
			}else if(secondMax < num) {
				secondMax = num;
			}
		}
		return firstMax+secondMax;
	}
}
