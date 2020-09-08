package com.problem.soving01;

import java.util.Arrays;

public class XUnionSortedArrays {
	public static void main(String[] args) {
		int[] firstArray = { 1, 2, 3, 4 };
		int[] secondArray = { 3, 4, 7, 9 };
		unionSortedArrays(firstArray,secondArray);
	}
	
	public static void unionSortedArrays(int arr1[],int arr2[]) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		int arrUnioun[] = new int[len1+len2];
		int firstArrIndex=0;
		int secondArrIndex=0;
		int uIndex=0;
		while (firstArrIndex < len1 && secondArrIndex < len2) {
			if (arr1[firstArrIndex] < arr2[secondArrIndex]) {
				arrUnioun[uIndex++] = arr1[firstArrIndex++];
			}else if(arr1[firstArrIndex] > arr2[secondArrIndex] ) {
				arrUnioun[uIndex++] = arr2[secondArrIndex++];
			}else {
				arrUnioun[uIndex++] = arr2[secondArrIndex++];
				firstArrIndex++;
			}
		}
		/*for (; firstArrIndex < len1; firstArrIndex++) {
			arrUnioun[uIndex++] = arr1[firstArrIndex];
		}
		for (; secondArrIndex < len2; secondArrIndex++) {
			arrUnioun[uIndex++] = arr1[secondArrIndex];
		}*/
		System.out.println("fI "+firstArrIndex);
		System.out.println("SEC "+secondArrIndex);
		System.out.println("Union Arrays :"+Arrays.toString(arrUnioun));
	}
	
}
