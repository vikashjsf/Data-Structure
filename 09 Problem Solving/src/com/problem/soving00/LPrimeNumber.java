package com.problem.soving00;

public class LPrimeNumber {
	public static void main(String[] args) {
		int num = 93;
		checkPriveNumber(num);
		printNPrimeNumber(1,100);
	}
	
	public static void checkPriveNumber(int num) {
		boolean flag = false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				break;
			else
				flag = true;
		}
		if (flag) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}
	
	/*
	We only have to loop through 2 to half of num, 
		because no number is divisible by more than its half
	*/
	public static void printNPrimeNumber(int low, int high) {
		while(low < high) {
			boolean flag = false;
			for (int i = 2; i < low/2 ; i++) {
				if(low % i ==0) { 
					break;
				}else {
					flag = true;
				}
			}
			if(flag) {
				System.out.print(low + " ");
			}
			low++;
		}
	}
}
