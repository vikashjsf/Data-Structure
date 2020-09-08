//Java Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers
package com.problem.soving00;

public class NumberCanBeExpAs2PrimeNumber {
	public static void main(String[] args) {
		int primeNum = 11;
		boolean status = false;
		for (int i = 2; i < primeNum / 2; i++) {
			if (primeCheck(i)) {
				int x = primeNum - i;
				if (primeCheck(x)) {
					System.out.println("i : " + i + " x :" + x);
					status = true;
				}  
			}
		}
		if (!status)
			System.out.println(primeNum + " cannot be expressed.");
	}

	public static boolean primeCheck(int num) {
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		return flag;
	}
}
