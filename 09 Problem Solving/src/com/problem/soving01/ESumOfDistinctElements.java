//Sum of all Unique elements in a given array
package com.problem.soving01;

import java.util.Arrays;
import java.util.HashSet;

public class ESumOfDistinctElements {
	public static void main(String[] args) {
		int [] arr = {1, 6, 4, 3, 2, 2, 3, 8, 1,8};
		sumOfUniqueElementUsingHashSet(arr);
		sumOfUniqueElementUsingArrays(arr);
	}
	
	public static void sumOfUniqueElementUsingHashSet(int[] arrA) {
		 HashSet<Integer> set = new HashSet<>();
		 int sum=0;
		 for (int i = 0; i < arrA.length; i++) {
			if(!set.contains(arrA[i])) {
				set.add(arrA[i]);
				sum = sum+arrA[i];
			}
		}
		 System.out.println("Unique Elements : "+set);
		 System.out.println("sum:"+sum);
	}
	
	public static void sumOfUniqueElementUsingArrays(int[] arrA) {
		 Arrays.sort(arrA); 
		 int sum=arrA[0];
		 for (int i = 1; i < arrA.length; i++) {
			 if(arrA[i-1]!=arrA[i]) {
				sum = sum+arrA[i];
			 }
		 }
		 System.out.println("sum:"+sum);
	}
	
	
	
}
