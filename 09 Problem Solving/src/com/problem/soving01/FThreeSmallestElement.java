//Find three smallest elements in a given array
package com.problem.soving01;

public class FThreeSmallestElement {
	public static void main(String[] args) {
		int [] arr = new int [] { 6, 8, 1, 9, 2, 10};
		threeSmallestElement(arr);
	}
	
	public static void threeSmallestElement(int[]arr) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int third = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if(first > num) {
				third=second;
				second=first;
				first=num;
			}else if(second >num) {
				third=second;
				second=num;
			}else if(third>num) {
				third=num;
			}
		}
		System.out.println("Smallest Three Numbers are :"+first + " "+second + " "+third);
	}
}
