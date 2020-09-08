package com.problem.soving01;

public class MissingNumberDuplicatedArray {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 3, 4, 5, 10 };
		missingNumber(arr1, arr2);
	}

	public static void missingNumber(int arr1[], int arr2[]) {
		int firstNum = arr1[0];
		int secondNum = arr2[0];
		for (int i = 1; i < arr1.length; i++) {
			firstNum = firstNum ^ arr1[i];
		}
		for (int i = 1; i < arr2.length; i++) {
			secondNum = secondNum ^ arr2[i];
		}
		int missingNumber = firstNum ^ secondNum;
		System.out.println("Missing Number : " + missingNumber);
	}
}
/*
We will use the properties of XOR gate.
Truth table of “Exclusive-OR”[^] or XOR gate is :

X	Y	Output
0	0	0
0	1	1
1	0	1
1	1	0
*/