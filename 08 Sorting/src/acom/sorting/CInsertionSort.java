package acom.sorting;

import java.util.Arrays;

public class CInsertionSort {
	public static void main(String[] args) {
		int [] arr = new int[] {5, 1, 6, 2, 4, 3};
		System.out.println("Befor Sorting : " + Arrays.toString(arr));
		insertionSort(arr);
	}

	public static void insertionSort(int arr[]) {
		int j, temp;
		for (int i = 1; i < arr.length; i++) {
			j = i;
			temp = arr[j];
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			System.out.println("j--> "+j + " temp :"+temp);
			arr[j] = temp;
			
		}
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
}
