package acom.sorting;

import java.util.Arrays;

public class Gheapifying {
	public static void main(String[] args) {
		int [] arr = new int [] {22,13,17,11,10,14,12};
		//int [] arr = new int [] {5,20,25};
		System.out.println("Befor :"+Arrays.toString(arr));
		int len = arr.length;
		sort(arr, len);
		System.out.println("After :"+Arrays.toString(arr));
	}
	
	
	public static void sort(int[] arr, int size) {
		// Build heap (rearrange array) 
		int i = (size / 2) + 1; // parent index
		for (; i >= 0; i--) {
			System.out.println("Parrents Index : "+ i +" Parrents Node Value : "+arr[i]);
			heapify(arr, size, i);
		}
		
		for (int j = size-1; j >= 0 ; j--) {
			int temp = arr[0];
			arr[0] = arr[j];
			arr[j]=temp;
			heapify(arr, j, 0);
			//System.out.println("Sort : "+Arrays.toString(arr));
		}
	}
	
	public static void heapify(int[]arr,int arrSize,int parrentIndex) {
		int childleftIndex = 2 * parrentIndex +1;
		int childrightIndex = 2 * parrentIndex +2;
		int max = parrentIndex ;
		if(childleftIndex < arrSize && arr[childleftIndex] > arr[max]) {
			max = childleftIndex;
		} 
		
		if(childrightIndex < arrSize && arr[childrightIndex] > arr[max]) {
			max = childrightIndex;
		}
		
		if(max!=parrentIndex) {
			System.out.println("heapifying Befor Swap :  :"+Arrays.toString(arr) + " Max : "+arr[max] +" Parent : "+arr[parrentIndex]);
			int temp = arr[max];
			arr[max] = arr[parrentIndex];
			arr[parrentIndex]=temp;
			System.out.println("heapifying After Swap :  :"+Arrays.toString(arr));
			heapify(arr, arrSize, max);
		}
	}
}
