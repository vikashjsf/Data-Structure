package com.problem.soving00;

public class MFactorOfGivenNumber {
	public static void main(String[] args) {
		int num = 60;
		factorOfGivenNumber(num);
	}
	
	public static void factorOfGivenNumber(int num) {
		if(num < 0)
			return;
		for (int i = 1; i <= num ; i++) {
			if(num % i ==0) {
				System.out.print(i + " ");
			}
		}
	}
}
