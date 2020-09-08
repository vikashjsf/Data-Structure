//GCD of two number
package com.problem.soving00;

public class HCForGCD {
	public static void main(String[] args) {
		int first = 56;
		int second = 98;
		gcd (first,second);
		gcd1(first,second);
	}
	
	//Using modulo Operator
	public static void gcd(int first, int second) {
		int gcd = 1;
		int smallest = first < second ?  first :second;
		System.out.println("Smallest Number : "+smallest);
		for (int i = 2; i <= smallest ; i++) {
			if (first % i == 0 && second % i == 0) {
				gcd = i;
			}
		}
		System.out.println("Gcd of given Number is : " + gcd);
	}
	
	//Without Using modulo operator
	public static void gcd1(int first, int second) {
		int gcd = 1;
		while (first != second) {
			if (first > second) {
				first = first - second;
			} else {
				second = second - first;
			}
		}
		gcd = first;
		System.out.println("gcd1 of given number is : " + gcd);
	}
}
