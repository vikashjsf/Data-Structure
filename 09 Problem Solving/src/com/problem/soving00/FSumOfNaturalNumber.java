package com.problem.soving00;

public class FSumOfNaturalNumber {
	public static void main(String[] args) {
		int fromNum = 1;
		int toNum = 100;
		sumOfNaturalNumber(fromNum, toNum);
		int sum =sumOfNaturalNumberRecursive(fromNum,toNum);
		System.out.println(sum);
	}
	
	public static void sumOfNaturalNumber(int fromNum, int toNum) {
		int sum = 0;
		for (int i = fromNum; i <= toNum; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the given range number is : "+sum);
	}
	
	public static int sumOfNaturalNumberRecursive(int fromNum, int toNum) {
		if(fromNum > toNum) 
			return 0;
		int sum = 0;
		sum = sum + fromNum;
		return sum + sumOfNaturalNumberRecursive(fromNum+1, toNum);
	}
}
