package acom.sorting;

import java.util.Arrays;

public class BSelectionSort {
	public static void main(String[] args) {
		int [] arr = new int[] {4, 6, 8, 9, 10, 20};
		selectionSort(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr)
	{
		if(arr==null || arr.length==0)
			return;
		int  temp;
		boolean isWapped = true;
		for (int i = 0; i < arr.length; i++) {
			int minimumIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minimumIndex] > arr[j]) {
					minimumIndex=j;
					isWapped = false;
				}
			}
			System.out.println("Minimum : "+arr[minimumIndex]);
			if(isWapped)
				break;
			temp = arr[i];
			arr[i]=arr[minimumIndex];
			arr[minimumIndex]=temp;
		}
	}
}
