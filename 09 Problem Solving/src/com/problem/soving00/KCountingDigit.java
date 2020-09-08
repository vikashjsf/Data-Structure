package com.problem.soving00;

public class KCountingDigit {
	public static void main(String[] args) {
		int num = 1200059 , count = 0;
		while(num > 0) {
			count++;
			num = num/10;
		}
		System.out.println("Number of Digit :"+count);
	}
}
