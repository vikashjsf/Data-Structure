//Divide given Array into two subArrays.
package acom.sorting;

import java.util.Arrays;

public class DdivideGivenArrayIntoTwoSubArrays {
	public static void main(String[] args) {
		int [] arr = new int[] {10,8,2,4,3,1};
		System.out.println("Original : "+Arrays.toString(arr));
		divideGivenArrayIntoTwoSubArrays(arr, arr.length);
	}
	
	public static void divideGivenArrayIntoTwoSubArrays(int arr[], int n) {
		// no of element into the left arrays
		int nLeft = 2;
		if (n < 2) {
			return;
		}

		int mid = nLeft;

		int[] left = new int[mid];
		int[] right = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int j = mid; j < n; j++) {
			right[j - mid] = arr[j];
		}
		System.out.println("Left  Arrays : "+Arrays.toString(left));
		System.out.println("Right Arrays : "+Arrays.toString(right));
	}
}
