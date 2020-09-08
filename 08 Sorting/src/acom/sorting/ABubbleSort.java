package acom.sorting;

import java.util.Arrays;

public class ABubbleSort {
	public static void main(String[] args) {
		//1, 55, 66, 77, 88, 99
		int [] arr = new int[] {64, 34, 25, 12, 22, 11, 90};
		System.out.println("Befor Sorting : "+Arrays.toString(arr));
		//bubbleSort(arr);
		bubbleSort(arr,arr.length);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
	
	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length == 0)
			return;
		boolean isSwapped = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					//arr[j-1]< arr[j] - it will print in descending order
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					isSwapped = false;
				}
				System.out.println("*******************");
			}
			System.out.println("##############");
			if (isSwapped)
				break;
		}
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
	
	// A function to implement bubble sort
	static void bubbleSort(int arr[], int n) {
		// Base case
		if (n == 1)
			return;
		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i = 1; i < n ; i++) {
			if (arr[i-1] > arr[i]) {
				// swap arr[i], arr[i+1]
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}

		// Largest element is fixed,
		// recur for remaining array
		bubbleSort(arr, n - 1);
		}
	}
}
