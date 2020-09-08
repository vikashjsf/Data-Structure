//Find third largest element in a given array
package com.problem.soving01;
public class DMaxThreeNumber {
	public static void main(String[] args) {
		int [] a = { 6, 8, 1, 9, 2, 1, 10};
		thirdMaxNumber(a);
	}
	
	public static void thirdMaxNumber(int[] arr) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third= Integer.MIN_VALUE;
		
		for (int num : arr) {
			if(num > first) {
				third=second;
				second=first;
				first=num;
			}else if(num >second)
			{
				third=second;
				second=num;
			}else if(num > third) {
				third =num;
			}
		}
		System.out.println("Largest third Number :"+third);
	}
}
